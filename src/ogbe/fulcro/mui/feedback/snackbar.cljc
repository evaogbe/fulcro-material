(ns ogbe.fulcro.mui.feedback.snackbar
  #?(:cljs (:require
            ["@mui/material/Snackbar" :default Snackbar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-snackbar #?(:clj  (fn [& _args])
                    :cljs (interop/react-factory Snackbar)))
