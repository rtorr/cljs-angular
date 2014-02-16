(ns cljs-angular.core)

(def app
  (.module js/angular "app" (array)))

(def a-vector [1 2 3 4 5])

(.controller app "wat"
  (fn [$scope]
    (set! (.-bob $scope) "bobber")
    (set! (.-addTodo $scope)
          (fn []
            (set! (.-bob $scope)
                  (count a-vector))))))

