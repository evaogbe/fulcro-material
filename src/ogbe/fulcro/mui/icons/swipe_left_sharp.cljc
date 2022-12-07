(ns ogbe.fulcro.mui.icons.swipe-left-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SwipeLeftSharp" :default SwipeLeftSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe-left-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwipeLeftSharp)))