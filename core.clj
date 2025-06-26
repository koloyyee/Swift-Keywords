;; Core logic for generating the keywords maps, and files.
;; Only "gen-readme" is exposed.
;; Avoid changing this file unless bugs were found.
;; 
;; David Ko

(ns core
  (:require
   [clojure.string :as str]))

(def  ^:private kw-file "keywords.txt")
(def  ^:private readme "README.md")
(def  ^:private keywords-map-file "keywords_map.clj")

(def  ^:private keywords-vec (str/split  (slurp kw-file) #"\n"))

(def  ^:private readme-header
  (str "# Swift Keywords\n"
       "**Disclaimer**: Swift is a trademark of Apple Inc. This is an unofficial documentation project created for educational purposes.\nAll Swift language keywords, syntax, and related concepts are the intellectual property of Apple Inc. This project is not affiliated with, endorsed by, or sponsored by Apple Inc.\n\n"
       "**Copyright Notice**: Swift and the Swift logo are trademarks of Apple Inc.\n\n"
       "---\n\n"
       "## Motivation\n"
       "Swift got over 200 keywords now here is table lookup for the keywords, definitions and where to use.\n\n"
       "**AI Disclaimer**:\n"
       "The definitions and where to use were researched with Gemini, if you find it in accurate please create an issue.\n\n"
       "---\n\n"))

(defn  ^:private gen-toc-item
  "Generate Table of Content individual row of item."
  [kw]
  (format "[%s](#%s)\n" kw kw))

(defn  ^:private gen-toc
  "Generate whole Table of Content based with all the keywords as row items."
  [kws]
  (into [] (map gen-toc-item kws)))
;; Table of Content 
(def toc
  (str readme-header
       "## Keywords Table of Content\n"
       (str/join ", " (gen-toc keywords-vec))))
#_toc

;; Generate table header
(def  ^:private header
  (str
   "## Look Up Table\n"
   "| Keyword | Definition | Where to use? |\n"
   "|----------|----------|----------|\n"))


(defn  ^:private gen-lookup-placeholder
  "Generate keywords_map.clj file for contribution"
  [kws]
  (spit keywords-map-file
        (str "(ns keywords-map)\n"
             "(def lookup-maps \n [\n"
             (str/join "\n"
                       (map #(format "{:kw \"%s\" :def \"\" :use \"\"}" %) kws))
             "]\n)")))
#_(gen-lookup-placeholder keywords-vec)


(defn  ^:private gen-row [kw-map]
  (format "|<p id='%s'>%s<p>|%s\t|%s\t|\n" (:kw kw-map) (:kw kw-map) (:def kw-map) (:use kw-map)))

(defn ^:private gen-rows [kws]
  (into [] (map gen-row kws)))

;; importing keywords-map vector values
(load-file keywords-map-file)
(require '[keywords-map :refer [lookup-maps]])
(def rows (str/join (gen-rows lookup-maps)))
#_rows

;; Footer for the file.
(def footer
  (str "\n\n## Contributing\n\n"
       "Want to help improve the Swift keywords documentation? We'd love your contributions!\n\n"
       "### How to Update Keyword Definitions\n\n"
       "1. **Edit the keywords map**: Open `keywords_map.clj` and update the definitions\n"
       "2. **Format**: Each keyword has three fields:\n"
       "   - `:kw` - The keyword name (don't change this)\n"
       "   - `:def` - Add a clear, concise definition\n"
       "   - `:use` - Describe where/how it's used (e.g., \"class, struct, func\")\n\n"
       "3. **Example**:\n"
       "   ```clojure\n"
       "   {:kw \"public\", :def \"Access level that allows entities to be used outside their module\", :use \"class, struct, func, var\"}\n"
       "   ```\n\n"
       "4. **Regenerate**: To generate file you need to have [babashka](https://github.com/babashka/babashka#installation) installed, to generate the latest README, \nrun the build script `bb gen.clj` to update the README\n\n"
       "### Guidelines\n\n"
       "- Keep definitions concise but informative\n"
       "- Include practical usage examples\n"
       "- Follow Swift's official terminology\n"
       "- Test your changes before submitting\n\n"
       "Thank you for contributing! 🙏"))

(defn gen-readme []
  (spit readme toc)
  (spit readme header :append true)
  (spit readme rows :append true)
  (spit readme footer :append true))