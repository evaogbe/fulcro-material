(ns ogbe.fulcro.mui.icons.bluetooth
  #?(:cljs (:require
            ["@mui/icons-material/Bluetooth" :default Bluetooth]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bluetooth
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Bluetooth)))