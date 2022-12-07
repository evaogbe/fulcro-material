(ns ogbe.fulcro.mui.icons.swipe-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SwipeTwoTone" :default SwipeTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwipeTwoTone)))