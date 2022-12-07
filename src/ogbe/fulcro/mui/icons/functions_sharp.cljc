(ns ogbe.fulcro.mui.icons.functions-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FunctionsSharp" :default FunctionsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-functions-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FunctionsSharp)))