(ns ogbe.fulcro.mui.icons.flash-auto
  #?(:cljs (:require
            ["@mui/icons-material/FlashAuto" :default FlashAuto]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flash-auto
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlashAuto)))