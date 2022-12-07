(ns ogbe.fulcro.mui.icons.cases
  #?(:cljs (:require
            ["@mui/icons-material/Cases" :default Cases]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cases
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Cases)))