(ns ogbe.fulcro.mui.icons.push-pin-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PushPinOutlined" :default PushPinOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-push-pin-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PushPinOutlined)))