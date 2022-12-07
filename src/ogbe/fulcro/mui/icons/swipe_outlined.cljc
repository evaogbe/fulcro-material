(ns ogbe.fulcro.mui.icons.swipe-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SwipeOutlined" :default SwipeOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwipeOutlined)))