(ns ogbe.fulcro.mui.icons.bluetooth-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BluetoothSharp" :default BluetoothSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bluetooth-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BluetoothSharp)))