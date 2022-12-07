(ns ogbe.fulcro.mui.icons.report-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ReportSharp" :default ReportSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-report-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReportSharp)))