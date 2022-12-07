(ns ogbe.fulcro.mui.icons.swipe-down-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SwipeDownRounded" :default SwipeDownRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe-down-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwipeDownRounded)))