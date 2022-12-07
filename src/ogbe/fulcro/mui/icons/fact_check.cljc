(ns ogbe.fulcro.mui.icons.fact-check
  #?(:cljs (:require
            ["@mui/icons-material/FactCheck" :default FactCheck]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fact-check
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FactCheck)))