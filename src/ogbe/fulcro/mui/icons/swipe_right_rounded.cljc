(ns ogbe.fulcro.mui.icons.swipe-right-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SwipeRightRounded" :default SwipeRightRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe-right-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwipeRightRounded)))