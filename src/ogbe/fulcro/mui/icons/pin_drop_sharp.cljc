(ns ogbe.fulcro.mui.icons.pin-drop-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PinDropSharp" :default PinDropSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pin-drop-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PinDropSharp)))