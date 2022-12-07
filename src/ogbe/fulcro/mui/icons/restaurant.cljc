(ns ogbe.fulcro.mui.icons.restaurant
  #?(:cljs (:require
            ["@mui/icons-material/Restaurant" :default Restaurant]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-restaurant
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Restaurant)))