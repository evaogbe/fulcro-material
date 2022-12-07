(ns ogbe.fulcro.mui.icons.charging-station-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ChargingStationSharp" :default ChargingStationSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-charging-station-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChargingStationSharp)))