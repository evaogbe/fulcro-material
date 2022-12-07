(ns ogbe.fulcro.mui.icons.fiber-pin-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FiberPinSharp" :default FiberPinSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fiber-pin-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FiberPinSharp)))