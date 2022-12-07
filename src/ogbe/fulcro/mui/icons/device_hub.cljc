(ns ogbe.fulcro.mui.icons.device-hub
  #?(:cljs (:require
            ["@mui/icons-material/DeviceHub" :default DeviceHub]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-device-hub
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeviceHub)))