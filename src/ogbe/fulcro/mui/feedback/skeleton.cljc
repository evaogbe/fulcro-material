(ns ogbe.fulcro.mui.feedback.skeleton
  #?(:cljs (:require
            ["@mui/material/Skeleton" :default Skeleton]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-skeleton #?(:clj  (fn [& _args])
                    :cljs (interop/react-factory Skeleton)))
