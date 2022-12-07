(ns ogbe.fulcro.mui.icons.swipe-down-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SwipeDownOutlined" :default SwipeDownOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe-down-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwipeDownOutlined)))