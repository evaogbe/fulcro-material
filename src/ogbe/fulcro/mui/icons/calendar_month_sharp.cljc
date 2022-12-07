(ns ogbe.fulcro.mui.icons.calendar-month-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CalendarMonthSharp" :default CalendarMonthSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-calendar-month-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CalendarMonthSharp)))