(ns ogbe.fulcro.mui.icons.swipe-left-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SwipeLeftRounded" :default SwipeLeftRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe-left-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwipeLeftRounded)))