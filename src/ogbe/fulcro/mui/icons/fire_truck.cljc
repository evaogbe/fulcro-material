(ns ogbe.fulcro.mui.icons.fire-truck
  #?(:cljs (:require
            ["@mui/icons-material/FireTruck" :default FireTruck]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fire-truck
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FireTruck)))