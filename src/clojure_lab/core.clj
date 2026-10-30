(ns clojure-lab.core)

(defn solve
  "Example entry point. Replace this with the interview task."
  [xs]
  (reduce + 0 xs))

(comment
  (solve [1 2 3])
  (tap> (solve [1 2 3])))
