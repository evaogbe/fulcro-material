(ns ogbe.fulcro.mui.icons.pin-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PinOutlined" :default PinOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pin-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PinOutlined)))