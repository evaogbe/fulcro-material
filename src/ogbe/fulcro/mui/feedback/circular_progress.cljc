(ns ogbe.fulcro.mui.feedback.circular-progress
  #?(:cljs (:require
            ["@mui/material/CircularProgress" :default CircularProgress]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-circular-progress #?(:clj  (fn [& _args])
                             :cljs (interop/react-factory CircularProgress)))
