(ns ogbe.fulcro.mui.icons.bluetooth-connected
  #?(:cljs (:require
            ["@mui/icons-material/BluetoothConnected" :default BluetoothConnected]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bluetooth-connected
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BluetoothConnected)))