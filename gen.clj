#! /usr/bin/env bb


;; The goal of this script is to generate a markdown file for Swift keywords lookups,
;; based on keywords.txt file, keywords.txt came from Swift syntax repo on Github [link](https://github.com/swiftlang/swift-syntax/blob/main/CodeGeneration/Sources/SyntaxSupport/KeywordSpec.swift)
;; We will be creating anchor tags for keywords


;; Markdown sample
;; [Introduction](#introduction)
;; [<Anchor Section name>](<anchor id>)


(ns gen)
(load-file "core.clj")
(require '[core :refer [gen-readme]])


(gen-readme)