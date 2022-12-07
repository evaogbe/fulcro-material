(ns ogbe.fulcro.mui.icons.charging-station
  #?(:cljs (:require
            ["@mui/icons-material/ChargingStation" :default ChargingStation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-charging-station
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChargingStation)))