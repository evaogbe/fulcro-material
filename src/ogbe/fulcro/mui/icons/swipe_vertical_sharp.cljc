(ns ogbe.fulcro.mui.icons.swipe-vertical-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SwipeVerticalSharp" :default SwipeVerticalSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe-vertical-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwipeVerticalSharp)))