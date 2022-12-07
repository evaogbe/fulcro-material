(ns ogbe.fulcro.mui.feedback.dialog-actions
  #?(:cljs (:require
            ["@mui/material/DialogActions" :default DialogActions]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-dialog-actions #?(:clj  (fn [& _args])
                          :cljs (interop/react-factory DialogActions)))
