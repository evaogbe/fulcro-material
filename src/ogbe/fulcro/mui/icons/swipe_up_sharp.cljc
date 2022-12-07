(ns ogbe.fulcro.mui.icons.swipe-up-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SwipeUpSharp" :default SwipeUpSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe-up-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwipeUpSharp)))