(ns ogbe.fulcro.mui.date-pickers
  #?(:cljs
     (:require
      ["@mui/x-date-pickers" :refer [CalendarPicker
                                     CalendarPickerSkeleton
                                     ClockPicker
                                     DatePicker
                                     DateTimePicker
                                     DesktopDatePicker
                                     DesktopDateTimePicker
                                     DesktopTimePicker
                                     LocalizationProvider
                                     MobileDatePicker
                                     MobileDateTimePicker
                                     MobileTimePicker
                                     MonthPicker
                                     PickersDay
                                     StaticDatePicker
                                     StaticDateTimePicker
                                     StaticTimePicker
                                     TimePicker
                                     YearPicker]]
      [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-calendar-picker #?(:clj  (fn [& _args])
                           :cljs (interop/react-factory CalendarPicker)))
(def ui-calendar-picker-skeleton #?(:clj  (fn [& _args])
                                    :cljs (interop/react-factory CalendarPickerSkeleton)))
(def ui-clock-picker #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory ClockPicker)))
(def ui-date-picker #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory DatePicker)))
(def ui-date-time-picker #?(:clj  (fn [& _args])
                            :cljs (interop/react-factory DateTimePicker)))
(def ui-desktop-date-picker #?(:clj  (fn [& _args])
                               :cljs (interop/react-factory DesktopDatePicker)))
(def ui-desktop-date-time-picker #?(:clj  (fn [& _args])
                                    :cljs (interop/react-factory DesktopDateTimePicker)))
(def ui-desktop-time-picker #?(:clj  (fn [& _args])
                               :cljs (interop/react-factory DesktopTimePicker)))
(def ui-localization-provider #?(:clj  (fn [& _args])
                                 :cljs (interop/react-factory LocalizationProvider)))
(def ui-mobile-date-picker #?(:clj  (fn [& _args])
                              :cljs (interop/react-factory MobileDatePicker)))
(def ui-mobile-date-time-picker #?(:clj  (fn [& _args])
                                   :cljs (interop/react-factory MobileDateTimePicker)))
(def ui-mobile-time-picker #?(:clj  (fn [& _args])
                              :cljs (interop/react-factory MobileTimePicker)))
(def ui-month-picker #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory MonthPicker)))
(def ui-pickers-day #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory PickersDay)))
(def ui-static-date-picker #?(:clj  (fn [& _args])
                              :cljs (interop/react-factory StaticDatePicker)))
(def ui-static-date-time-picker #?(:clj  (fn [& _args])
                                   :cljs (interop/react-factory StaticDateTimePicker)))
(def ui-static-time-picker #?(:clj  (fn [& _args])
                              :cljs (interop/react-factory StaticTimePicker)))
(def ui-time-picker #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory TimePicker)))
(def ui-year-picker #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory YearPicker)))
