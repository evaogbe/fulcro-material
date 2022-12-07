(ns ogbe.fulcro.mui.icons.swipe-up-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SwipeUpRounded" :default SwipeUpRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe-up-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwipeUpRounded)))