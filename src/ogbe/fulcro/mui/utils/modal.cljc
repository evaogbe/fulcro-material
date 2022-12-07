(ns ogbe.fulcro.mui.utils.modal
  #?(:cljs (:require
            ["@mui/material/Modal" :default Modal]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-modal #?(:clj  (fn [& _args])
                 :cljs (interop/react-factory Modal)))
