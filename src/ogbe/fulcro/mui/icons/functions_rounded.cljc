(ns ogbe.fulcro.mui.icons.functions-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FunctionsRounded" :default FunctionsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-functions-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FunctionsRounded)))