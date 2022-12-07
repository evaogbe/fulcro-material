(ns ogbe.fulcro.mui.icons.set-meal
  #?(:cljs (:require
            ["@mui/icons-material/SetMeal" :default SetMeal]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-set-meal
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SetMeal)))