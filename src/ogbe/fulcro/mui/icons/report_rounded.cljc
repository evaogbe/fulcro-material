(ns ogbe.fulcro.mui.icons.report-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ReportRounded" :default ReportRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-report-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReportRounded)))