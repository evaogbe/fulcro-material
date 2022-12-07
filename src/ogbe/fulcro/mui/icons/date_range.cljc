(ns ogbe.fulcro.mui.icons.date-range
  #?(:cljs (:require
            ["@mui/icons-material/DateRange" :default DateRange]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-date-range
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DateRange)))