(ns ogbe.fulcro.mui.icons.bluetooth-drive
  #?(:cljs (:require
            ["@mui/icons-material/BluetoothDrive" :default BluetoothDrive]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bluetooth-drive
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BluetoothDrive)))