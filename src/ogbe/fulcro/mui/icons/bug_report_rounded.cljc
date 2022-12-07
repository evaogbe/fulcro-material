(ns ogbe.fulcro.mui.icons.bug-report-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BugReportRounded" :default BugReportRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bug-report-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BugReportRounded)))