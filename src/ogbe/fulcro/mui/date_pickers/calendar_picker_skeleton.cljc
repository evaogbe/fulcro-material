(ns ogbe.fulcro.mui.date-pickers.calendar-picker-skeleton
  #?(:cljs (:require
            ["@mui/x-date-pickers/CalendarPickerSkeleton" :refer [CalendarPickerSkeleton]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-calendar-picker-skeleton #?(:clj  (fn [& _args])
                                    :cljs (interop/react-factory CalendarPickerSkeleton)))
