(ns ogbe.fulcro.mui.icons.bluetooth-disabled
  #?(:cljs (:require
            ["@mui/icons-material/BluetoothDisabled" :default BluetoothDisabled]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bluetooth-disabled
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BluetoothDisabled)))