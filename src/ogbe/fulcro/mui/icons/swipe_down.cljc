(ns ogbe.fulcro.mui.icons.swipe-down
  #?(:cljs (:require
            ["@mui/icons-material/SwipeDown" :default SwipeDown]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe-down
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwipeDown)))