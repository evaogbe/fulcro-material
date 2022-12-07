(ns ogbe.fulcro.mui.icons.no-meals
  #?(:cljs (:require
            ["@mui/icons-material/NoMeals" :default NoMeals]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-meals
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoMeals)))