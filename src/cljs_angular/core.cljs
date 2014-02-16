(ns cljs-angular.core
  (:use-macros [cljs-angular.clj.macros :only [log set-scope controller]]))

(def app
  (.module js/angular "app" (array)))

(def a-vector [1 2 3 4 5])

(controller app "bro" [$scope]
     (set-scope $scope "wat" "wooo")
     (log $scope))


(.controller app "wat"
  (fn [$scope]
    (set-scope $scope "dusssssde" "wooo")
    (log $scope)
    (set! (.-bob $scope) "bobber")
    (set! (.-addTodo $scope)
          (fn []
            (set! (.-bob $scope)
                  (count a-vector))))))
