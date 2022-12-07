(ns ogbe.fulcro.mui.icons.pinch-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PinchRounded" :default PinchRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pinch-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PinchRounded)))