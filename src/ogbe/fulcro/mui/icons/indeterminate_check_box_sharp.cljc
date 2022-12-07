(ns ogbe.fulcro.mui.icons.indeterminate-check-box-sharp
  #?(:cljs (:require
            ["@mui/icons-material/IndeterminateCheckBoxSharp" :default IndeterminateCheckBoxSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-indeterminate-check-box-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory IndeterminateCheckBoxSharp)))