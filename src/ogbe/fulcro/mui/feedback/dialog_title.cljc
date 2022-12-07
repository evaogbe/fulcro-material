(ns ogbe.fulcro.mui.feedback.dialog-title
  #?(:cljs (:require
            ["@mui/material/DialogTitle" :default DialogTitle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-dialog-title #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory DialogTitle)))
