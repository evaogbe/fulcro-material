(ns ogbe.fulcro.mui.feedback.dialog
  #?(:cljs (:require
            ["@mui/material/Dialog" :default Dialog]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-dialog #?(:clj  (fn [& _args])
                  :cljs (interop/react-factory Dialog)))
