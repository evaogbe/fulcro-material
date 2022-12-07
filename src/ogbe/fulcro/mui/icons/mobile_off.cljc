(ns ogbe.fulcro.mui.icons.mobile-off
  #?(:cljs (:require
            ["@mui/icons-material/MobileOff" :default MobileOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mobile-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MobileOff)))