(ns ogbe.fulcro.mui.feedback.alert
  #?(:cljs (:require
            ["@mui/material/Alert" :default Alert]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-alert #?(:clj  (fn [& _args])
                 :cljs (interop/react-factory Alert)))
