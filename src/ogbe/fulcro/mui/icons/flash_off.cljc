(ns ogbe.fulcro.mui.icons.flash-off
  #?(:cljs (:require
            ["@mui/icons-material/FlashOff" :default FlashOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flash-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlashOff)))