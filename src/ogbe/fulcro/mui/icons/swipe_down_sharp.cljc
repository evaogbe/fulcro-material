(ns ogbe.fulcro.mui.icons.swipe-down-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SwipeDownSharp" :default SwipeDownSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe-down-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwipeDownSharp)))