(ns ogbe.fulcro.mui.feedback.linear-progress
  #?(:cljs (:require
            ["@mui/material/LinearProgress" :default LinearProgress]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-linear-progress #?(:clj  (fn [& _args])
                           :cljs (interop/react-factory LinearProgress)))
