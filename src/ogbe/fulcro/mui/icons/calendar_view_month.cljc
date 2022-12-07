(ns ogbe.fulcro.mui.icons.calendar-view-month
  #?(:cljs (:require
            ["@mui/icons-material/CalendarViewMonth" :default CalendarViewMonth]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-calendar-view-month
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CalendarViewMonth)))