(ns ogbe.fulcro.mui.icons.bluetooth-searching
  #?(:cljs (:require
            ["@mui/icons-material/BluetoothSearching" :default BluetoothSearching]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bluetooth-searching
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BluetoothSearching)))