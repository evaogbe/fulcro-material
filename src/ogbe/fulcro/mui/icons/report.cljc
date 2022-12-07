(ns ogbe.fulcro.mui.icons.report
  #?(:cljs (:require
            ["@mui/icons-material/Report" :default Report]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-report
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Report)))