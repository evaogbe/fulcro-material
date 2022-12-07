(ns ogbe.fulcro.mui.icons.food-bank
  #?(:cljs (:require
            ["@mui/icons-material/FoodBank" :default FoodBank]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-food-bank
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FoodBank)))