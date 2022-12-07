(ns ogbe.fulcro.mui.icons.device-unknown
  #?(:cljs (:require
            ["@mui/icons-material/DeviceUnknown" :default DeviceUnknown]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-device-unknown
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeviceUnknown)))