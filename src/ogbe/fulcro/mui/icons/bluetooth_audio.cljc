(ns ogbe.fulcro.mui.icons.bluetooth-audio
  #?(:cljs (:require
            ["@mui/icons-material/BluetoothAudio" :default BluetoothAudio]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bluetooth-audio
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BluetoothAudio)))