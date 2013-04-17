(ns clojure-heroku-playground.main
  (:use clojure-heroku-playground.handler
        [ring.adapter.jetty :only [run-jetty]])

  (:require [clojure-heroku-playground.handler :as web]))

(defn -main [& m]
  (run-jetty #'web/app {:port (Integer. (get (System/getenv) "PORT" "8085"))}))
