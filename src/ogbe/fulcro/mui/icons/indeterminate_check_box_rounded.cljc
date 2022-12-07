(ns ogbe.fulcro.mui.icons.indeterminate-check-box-rounded
  #?(:cljs (:require
            ["@mui/icons-material/IndeterminateCheckBoxRounded" :default IndeterminateCheckBoxRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-indeterminate-check-box-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory IndeterminateCheckBoxRounded)))