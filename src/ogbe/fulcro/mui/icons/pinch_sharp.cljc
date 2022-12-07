(ns ogbe.fulcro.mui.icons.pinch-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PinchSharp" :default PinchSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pinch-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PinchSharp)))