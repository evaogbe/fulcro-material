(ns ogbe.fulcro.mui.icons.cases-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CasesRounded" :default CasesRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cases-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CasesRounded)))