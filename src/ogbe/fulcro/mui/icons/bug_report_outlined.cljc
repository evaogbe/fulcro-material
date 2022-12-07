(ns ogbe.fulcro.mui.icons.bug-report-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BugReportOutlined" :default BugReportOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bug-report-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BugReportOutlined)))