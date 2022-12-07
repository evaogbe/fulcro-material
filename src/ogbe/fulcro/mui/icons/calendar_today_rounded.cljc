(ns ogbe.fulcro.mui.icons.calendar-today-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CalendarTodayRounded" :default CalendarTodayRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-calendar-today-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CalendarTodayRounded)))