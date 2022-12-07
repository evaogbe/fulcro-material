(ns ogbe.fulcro.mui.icons.calendar-today-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CalendarTodaySharp" :default CalendarTodaySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-calendar-today-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CalendarTodaySharp)))