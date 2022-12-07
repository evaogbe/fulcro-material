(ns ogbe.fulcro.mui.icons.flash-auto-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FlashAutoRounded" :default FlashAutoRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flash-auto-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlashAutoRounded)))