(ns ogbe.fulcro.mui.icons.calendar-month-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CalendarMonthRounded" :default CalendarMonthRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-calendar-month-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CalendarMonthRounded)))