(ns ogbe.fulcro.mui.icons.restaurant-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RestaurantSharp" :default RestaurantSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-restaurant-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RestaurantSharp)))