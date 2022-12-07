(ns ogbe.fulcro.mui.icons.swipe-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SwipeRounded" :default SwipeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwipeRounded)))