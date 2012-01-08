(ns org.travis-ci.example.test.core
  (:use [org.travis-ci.example.core])
  (:use [clojure.test]))

(deftest test-absolute-truth
  (is true))

(deftest test-some-basic-arithmetic
  (is (= 10 (+ 1 2 3 4))))
