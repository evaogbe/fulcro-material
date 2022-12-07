(ns ogbe.fulcro.mui.icons.swipe-up
  #?(:cljs (:require
            ["@mui/icons-material/SwipeUp" :default SwipeUp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe-up
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwipeUp)))