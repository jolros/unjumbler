(ns unjumbler.core
  (:require [clojure.math.combinatorics :as combo]))

(defn findwords
  [& words]
  (map (fn [word]
         (filter #(unjumbler.WordChecker/check %)
                 (map #(apply str %)
                      (combo/permutations (seq (clojure.string/lower-case word))))))
       words)
  )
