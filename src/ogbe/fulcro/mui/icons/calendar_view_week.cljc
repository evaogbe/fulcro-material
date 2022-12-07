(ns ogbe.fulcro.mui.icons.calendar-view-week
  #?(:cljs (:require
            ["@mui/icons-material/CalendarViewWeek" :default CalendarViewWeek]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-calendar-view-week
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CalendarViewWeek)))