(ns cljs-angular.clj.macros)

(defmacro set-scope
  [sc scn & body]
   `(def ~sc (js-obj))
   `(aset ~sc ~scn ~@body))

(defmacro controller
  [module name deps stuff]
   `(.controller ~module ~name
      (fn ~deps
        ~stuff)))

(defmacro log
  [tolog]
   `(.log js.console ~tolog))


