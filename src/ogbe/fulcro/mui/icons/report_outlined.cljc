(ns ogbe.fulcro.mui.icons.report-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ReportOutlined" :default ReportOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-report-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReportOutlined)))