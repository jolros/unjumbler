(ns unjumbler.core
  (:require [clojure.math.combinatorics :as combo]))

(defn findwords
  [jumbled]
  (filter #(unjumbler.WordChecker/check %)
          (map #(apply str %)
               (combo/permutations (seq (clojure.string/lower-case jumbled))))))

(defn findwordlist
  [words]
  (map #(findwords %) words))