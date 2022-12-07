(ns ogbe.fulcro.mui.icons.indeterminate-check-box
  #?(:cljs (:require
            ["@mui/icons-material/IndeterminateCheckBox" :default IndeterminateCheckBox]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-indeterminate-check-box
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory IndeterminateCheckBox)))