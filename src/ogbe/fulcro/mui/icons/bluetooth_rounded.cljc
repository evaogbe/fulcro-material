(ns ogbe.fulcro.mui.icons.bluetooth-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BluetoothRounded" :default BluetoothRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bluetooth-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BluetoothRounded)))