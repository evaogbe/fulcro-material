(ns ogbe.fulcro.mui.icons.pin-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PinSharp" :default PinSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pin-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PinSharp)))