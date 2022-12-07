(ns ogbe.fulcro.mui.icons.pinch-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PinchTwoTone" :default PinchTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pinch-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PinchTwoTone)))