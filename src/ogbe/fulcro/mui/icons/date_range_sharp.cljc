(ns ogbe.fulcro.mui.icons.date-range-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DateRangeSharp" :default DateRangeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-date-range-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DateRangeSharp)))