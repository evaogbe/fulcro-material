(ns ogbe.fulcro.mui.icons.date-range-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DateRangeRounded" :default DateRangeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-date-range-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DateRangeRounded)))