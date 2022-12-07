(ns ogbe.fulcro.mui.icons.swipe-right
  #?(:cljs (:require
            ["@mui/icons-material/SwipeRight" :default SwipeRight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe-right
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwipeRight)))