(ns ogbe.fulcro.mui.icons.devices-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/DevicesTwoTone" :default DevicesTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-devices-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DevicesTwoTone)))