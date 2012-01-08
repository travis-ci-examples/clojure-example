(defproject org.travis-ci/example "1.0.0-SNAPSHOT"
  :description "An example Clojure project that uses Leiningen, clojure.test and uses travis-ci.org for CI"
  :repositories {
                 "clojure-releases" "http://build.clojure.org/releases"
                 "sonatype" {:url "http://oss.sonatype.org/content/repositories/releases"
                             :snapshots false
                             :releases {:checksum :fail :update :always}
                             }
                 "sonatype-snapshots" {:url "http://oss.sonatype.org/content/repositories/snapshots"
                                       :snapshots true
                                       :releases {:checksum :fail :update :always}
                                       }
                 }
  :dependencies [[org.clojure/clojure "1.3.0"]]
  :source-path        "src/clojure"
  :java-source-path   "src/java"
  :warn-on-reflection true
  :test-selectors   {:default        (fn [v] (not (:time-consuming v)))
                     :time-consuming (fn [v] (:time-consuming v))
                     :focus          (fn [v] (:focus v))
                     :all            (fn [_] true)})
