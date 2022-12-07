(ns ogbe.fulcro.mui.icons.calendar-today-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CalendarTodayOutlined" :default CalendarTodayOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-calendar-today-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CalendarTodayOutlined)))