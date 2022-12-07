(ns ogbe.fulcro.mui.icons.transform-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TransformSharp" :default TransformSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-transform-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TransformSharp)))