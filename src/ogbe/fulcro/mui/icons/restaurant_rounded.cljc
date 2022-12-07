(ns ogbe.fulcro.mui.icons.restaurant-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RestaurantRounded" :default RestaurantRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-restaurant-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RestaurantRounded)))