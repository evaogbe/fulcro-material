(ns ogbe.fulcro.mui.icons.restaurant-menu-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RestaurantMenuSharp" :default RestaurantMenuSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-restaurant-menu-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RestaurantMenuSharp)))