(ns scrape
  (:require
   [babashka.curl :as curl]
   [babashka.pods :as pods]
   [babashka.process :refer [process]] ;; --------------------
   [clojure.java.io :as io] ;; --------------------
   [clojure.set :refer [difference]]
   [clojure.string :as str]))

(pods/load-pod 'retrogradeorbit/bootleg "0.1.9")
(require '[pod.retrogradeorbit.bootleg.utils :refer [convert-to]]
         '[pod.retrogradeorbit.hickory.select :as s])
(def url "https://raw.githubusercontent.com/swiftlang/swift-syntax/refs/heads/main/Sources/SwiftSyntax/generated/Keyword.swift")

;; 1. Slurp the swift file from the url
;; 2. find line "private static let keywordTextLookupTable: [SyntaxText] = "
;; 3. Get all the strings from the array

(-> (curl/get url)
    :body
    str/trim
    (convert-to :hickory))


(defn scrape-keywords []
  (let [body (:body (curl/get url))
        ;; Regex to capture content between '[' and ']' after the target line prefix
        ;; It handles the multiline nature of the array content
        regex #"(?s)private static let keywordTextLookupTable: \[SyntaxText\] = \[\n(.*?)\n  \]"
        match (re-find regex body)]
    (if match
      (let [raw-content (nth match 1)
            ;; Extract individual string literals, handling escaped quotes
            keywords (map #(str/replace % #"^\"|\"$" "") (re-seq #"\"(?:\\\"|[^\"])*\"" raw-content))]
        (str/join "\n" keywords))
      "Keyword lookup table not found.")))

(defn find-missing-kws [existing-kws]
  (let [new-kws (set (str/split-lines (scrape-keywords)))
        existing-kws (set existing-kws)]
    (difference new-kws existing-kws)))

(defn write-kws-txt [kws action]
  (let [kws (str/join "\n" kws)]
    @(process ["echo" kws] {:out action :out-file (io/file "keywords.txt")})))


(comment
  @(process
    ["echo" (str/join "\n" (sort (str/split-lines (slurp "keywords.txt"))))]
    {:out :write :out-file (io/file "keywords.txt")}))
