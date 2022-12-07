(ns ogbe.fulcro.mui.date-pickers.calendar-picker
  #?(:cljs (:require
            ["@mui/x-date-pickers/CalendarPicker" :refer [CalendarPicker]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-calendar-picker #?(:clj  (fn [& _args])
                           :cljs (interop/react-factory CalendarPicker)))
