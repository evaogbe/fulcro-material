(ns ogbe.fulcro.mui.feedback.snackbar-content
  #?(:cljs (:require
            ["@mui/material/SnackbarContent" :default SnackbarContent]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-snackbar-content #?(:clj  (fn [& _args])
                            :cljs (interop/react-factory SnackbarContent)))
