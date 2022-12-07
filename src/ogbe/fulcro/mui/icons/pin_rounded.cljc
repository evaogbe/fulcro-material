(ns ogbe.fulcro.mui.icons.pin-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PinRounded" :default PinRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pin-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PinRounded)))