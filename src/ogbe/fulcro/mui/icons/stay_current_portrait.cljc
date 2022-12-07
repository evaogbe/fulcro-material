(ns ogbe.fulcro.mui.icons.stay-current-portrait
  #?(:cljs (:require
            ["@mui/icons-material/StayCurrentPortrait" :default StayCurrentPortrait]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stay-current-portrait
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StayCurrentPortrait)))