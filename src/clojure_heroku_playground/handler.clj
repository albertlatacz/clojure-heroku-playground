(ns clojure-heroku-playground.handler
  (:use compojure.core
        stencil.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] (render-file "example" {:what "World"}))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
