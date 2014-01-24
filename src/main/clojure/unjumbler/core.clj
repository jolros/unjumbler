(ns unjumbler.core
  (:require [clojure.math.combinatorics :as combo]
            [clojure.string :as str]))

(defn findwords
  [& words]
  (map (fn [word]
         (filter #(unjumbler.WordChecker/check %)
                 (map #(apply str %)
                      (combo/permutations (seq (str/lower-case word))))))
       words)
  )
