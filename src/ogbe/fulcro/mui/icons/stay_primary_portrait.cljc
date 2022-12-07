(ns ogbe.fulcro.mui.icons.stay-primary-portrait
  #?(:cljs (:require
            ["@mui/icons-material/StayPrimaryPortrait" :default StayPrimaryPortrait]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stay-primary-portrait
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StayPrimaryPortrait)))