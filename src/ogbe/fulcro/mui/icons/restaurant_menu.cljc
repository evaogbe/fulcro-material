(ns ogbe.fulcro.mui.icons.restaurant-menu
  #?(:cljs (:require
            ["@mui/icons-material/RestaurantMenu" :default RestaurantMenu]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-restaurant-menu
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RestaurantMenu)))