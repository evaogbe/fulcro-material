(ns ogbe.fulcro.mui.icons.calendar-month
  #?(:cljs (:require
            ["@mui/icons-material/CalendarMonth" :default CalendarMonth]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-calendar-month
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CalendarMonth)))