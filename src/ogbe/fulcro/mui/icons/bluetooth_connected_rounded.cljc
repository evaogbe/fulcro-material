(ns ogbe.fulcro.mui.icons.bluetooth-connected-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BluetoothConnectedRounded" :default BluetoothConnectedRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bluetooth-connected-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BluetoothConnectedRounded)))