(ns ogbe.fulcro.mui.icons.pinch-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PinchOutlined" :default PinchOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pinch-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PinchOutlined)))