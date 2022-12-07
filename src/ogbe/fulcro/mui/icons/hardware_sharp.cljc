(ns ogbe.fulcro.mui.icons.hardware-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HardwareSharp" :default HardwareSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hardware-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HardwareSharp)))