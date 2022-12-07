(ns ogbe.fulcro.mui.icons.swipe-left
  #?(:cljs (:require
            ["@mui/icons-material/SwipeLeft" :default SwipeLeft]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe-left
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwipeLeft)))