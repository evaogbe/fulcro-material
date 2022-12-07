(ns ogbe.fulcro.mui.feedback.backdrop
  #?(:cljs (:require
            ["@mui/material/Backdrop" :default Backdrop]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-backdrop #?(:clj  (fn [& _args])
                    :cljs (interop/react-factory Backdrop)))
