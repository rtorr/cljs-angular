(ns cljs-angular.clj.macros)

(defmacro set-scope
  [sc scn & body]
   `(def ~sc (js-obj))
   `(aset ~sc ~scn ~@body))

(defmacro controller
  [module name deps & body]
   `(.controller ~module ~name
      (fn ~deps
        ~@body)))

(defmacro log
  [tolog]
   `(.log js.console ~tolog))


