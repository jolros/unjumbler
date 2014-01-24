(defproject unjumbler "0.1.0-SNAPSHOT"
  :description "Tools to solve JUMBLE puzzles"
  :url "http://github.com/jolros/unjumbler"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"],
                 [org.clojure/math.combinatorics "0.0.7"],
                 [org.languagetool/language-en "2.4"]
                 ]
  :source-paths ["src" "src/main/clojure"]
  :java-source-paths ["src/main/java"] ; Java source is stored separately.
  :test-paths ["test" "src/test/clojure"]
)
