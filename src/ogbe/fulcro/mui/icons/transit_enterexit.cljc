(ns ogbe.fulcro.mui.icons.transit-enterexit
  #?(:cljs (:require
            ["@mui/icons-material/TransitEnterexit" :default TransitEnterexit]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-transit-enterexit
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TransitEnterexit)))