(ns ogbe.fulcro.mui.icons.report-off
  #?(:cljs (:require
            ["@mui/icons-material/ReportOff" :default ReportOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-report-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReportOff)))