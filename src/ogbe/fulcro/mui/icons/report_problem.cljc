(ns ogbe.fulcro.mui.icons.report-problem
  #?(:cljs (:require
            ["@mui/icons-material/ReportProblem" :default ReportProblem]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-report-problem
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReportProblem)))