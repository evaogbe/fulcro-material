(ns ogbe.fulcro.mui.icons.three-psharp
  #?(:cljs (:require
            ["@mui/icons-material/ThreePSharp" :default ThreePSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-three-psharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThreePSharp)))