(ns ogbe.fulcro.mui.feedback.dialog-content
  #?(:cljs (:require
            ["@mui/material/DialogContent" :default DialogContent]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-dialog-content #?(:clj  (fn [& _args])
                          :cljs (interop/react-factory DialogContent)))
