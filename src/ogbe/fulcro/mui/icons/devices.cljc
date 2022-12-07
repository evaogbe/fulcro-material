(ns ogbe.fulcro.mui.icons.devices
  #?(:cljs (:require
            ["@mui/icons-material/Devices" :default Devices]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-devices
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Devices)))