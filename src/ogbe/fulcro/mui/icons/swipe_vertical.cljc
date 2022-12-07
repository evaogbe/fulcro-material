(ns ogbe.fulcro.mui.icons.swipe-vertical
  #?(:cljs (:require
            ["@mui/icons-material/SwipeVertical" :default SwipeVertical]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe-vertical
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwipeVertical)))