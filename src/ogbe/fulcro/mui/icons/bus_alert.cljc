(ns ogbe.fulcro.mui.icons.bus-alert
  #?(:cljs (:require
            ["@mui/icons-material/BusAlert" :default BusAlert]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bus-alert
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BusAlert)))