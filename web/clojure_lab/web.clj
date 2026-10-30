(ns clojure-lab.web
  (:require [hiccup2.core :as h]
            [ring.adapter.jetty :as jetty]
            [clojure-lab.core :as core]))

(defn app [_request]
  {:status 200
   :headers {"content-type" "text/html; charset=utf-8"}
   :body (str (h/html [:html
                       [:head [:title "Clojure lab"]]
                       [:body
                        [:h1 "Clojure lab"]
                        [:p "1 + 2 + 3 = " (core/solve [1 2 3])]]]))})

(defn -main [& _]
  (jetty/run-jetty app {:port 3000 :join? true}))
