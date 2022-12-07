(ns ogbe.fulcro.mui.icons.call-to-action-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CallToActionRounded" :default CallToActionRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-call-to-action-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CallToActionRounded)))