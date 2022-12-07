(ns ogbe.fulcro.mui.icons.bluetooth-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/BluetoothTwoTone" :default BluetoothTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bluetooth-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BluetoothTwoTone)))