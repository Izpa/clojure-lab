(ns clojure-lab.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [clojure.test.check :as tc]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]
            [clojure-lab.core :as sut]))

(deftest solve-test
  (testing "small examples and the empty input"
    (is (= 6 (sut/solve [1 2 3])))
    (is (zero? (sut/solve [])))))

(deftest solve-property-test
  (is (:pass? (tc/quick-check
               100
               (prop/for-all [xs (gen/vector gen/small-integer)]
                             (= (apply + xs) (sut/solve xs)))))))
