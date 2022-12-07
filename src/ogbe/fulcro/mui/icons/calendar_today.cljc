(ns ogbe.fulcro.mui.icons.calendar-today
  #?(:cljs (:require
            ["@mui/icons-material/CalendarToday" :default CalendarToday]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-calendar-today
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CalendarToday)))