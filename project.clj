(defproject clojure-heroku-playground "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :aot  'clojure-heroku-playground.main
  :min-lein-version "2.0.0"
  :main clojure-heroku-playground.main
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [ring "1.1.6"]
                 [compojure "1.1.5"]]
  :plugins [[lein-ring "0.8.2"]]
  :ring {:handler clojure-heroku-playground.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.3"]]}})
