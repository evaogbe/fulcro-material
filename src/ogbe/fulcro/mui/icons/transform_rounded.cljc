(ns ogbe.fulcro.mui.icons.transform-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TransformRounded" :default TransformRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-transform-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TransformRounded)))