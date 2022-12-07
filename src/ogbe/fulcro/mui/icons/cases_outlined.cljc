(ns ogbe.fulcro.mui.icons.cases-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CasesOutlined" :default CasesOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cases-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CasesOutlined)))