(ns clojure-heroku-playground.test.handler
  (:use clojure.test
        ring.mock.request  
        clojure-heroku-playground.handler))

(deftest test-app
  (testing "main route"
    (let [response (app (request :get "/"))]
      (is (= (:status response) 200))
      (is (= (:body response) "Hello World"))))

  (testing "not-found route"
    (let [response (app (request :get "/invalid"))]
      (is (= (:status response) 404)))))