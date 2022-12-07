(ns ogbe.fulcro.mui.icons.calendar-view-day
  #?(:cljs (:require
            ["@mui/icons-material/CalendarViewDay" :default CalendarViewDay]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-calendar-view-day
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CalendarViewDay)))