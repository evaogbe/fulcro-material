(ns ogbe.fulcro.mui.inputs.rating
  #?(:cljs (:require
            ["@mui/material/Rating" :default Rating]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-rating
  "Use synchronous transact for onChange handler."
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Rating)))
