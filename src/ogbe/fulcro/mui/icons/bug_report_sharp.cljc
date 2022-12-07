(ns ogbe.fulcro.mui.icons.bug-report-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BugReportSharp" :default BugReportSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bug-report-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BugReportSharp)))