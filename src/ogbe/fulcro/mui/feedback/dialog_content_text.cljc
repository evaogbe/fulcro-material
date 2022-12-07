(ns ogbe.fulcro.mui.feedback.dialog-content-text
  #?(:cljs (:require
            ["@mui/material/DialogContentText" :default DialogContentText]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-dialog-content-text #?(:clj  (fn [& _args])
                               :cljs (interop/react-factory DialogContentText)))
