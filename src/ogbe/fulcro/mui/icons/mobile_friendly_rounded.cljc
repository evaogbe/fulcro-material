(ns ogbe.fulcro.mui.icons.mobile-friendly-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MobileFriendlyRounded" :default MobileFriendlyRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mobile-friendly-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MobileFriendlyRounded)))