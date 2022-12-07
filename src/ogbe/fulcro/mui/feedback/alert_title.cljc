(ns ogbe.fulcro.mui.feedback.alert-title
  #?(:cljs (:require
            ["@mui/material/AlertTitle" :default AlertTitle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-alert-title #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory AlertTitle)))
