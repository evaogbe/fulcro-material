(ns ogbe.fulcro.mui.icons.swipe-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SwipeSharp" :default SwipeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwipeSharp)))