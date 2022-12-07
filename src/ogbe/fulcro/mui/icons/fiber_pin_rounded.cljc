(ns ogbe.fulcro.mui.icons.fiber-pin-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FiberPinRounded" :default FiberPinRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fiber-pin-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FiberPinRounded)))