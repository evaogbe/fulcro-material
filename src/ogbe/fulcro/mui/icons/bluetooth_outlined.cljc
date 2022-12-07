(ns ogbe.fulcro.mui.icons.bluetooth-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BluetoothOutlined" :default BluetoothOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bluetooth-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BluetoothOutlined)))