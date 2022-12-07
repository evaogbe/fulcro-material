(ns ogbe.fulcro.mui.icons.restaurant-outlined
  #?(:cljs (:require
            ["@mui/icons-material/RestaurantOutlined" :default RestaurantOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-restaurant-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RestaurantOutlined)))