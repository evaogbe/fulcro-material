(ns ogbe.fulcro.mui.icons.restaurant-menu-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RestaurantMenuRounded" :default RestaurantMenuRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-restaurant-menu-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RestaurantMenuRounded)))