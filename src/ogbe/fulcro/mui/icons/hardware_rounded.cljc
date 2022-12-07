(ns ogbe.fulcro.mui.icons.hardware-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HardwareRounded" :default HardwareRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hardware-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HardwareRounded)))