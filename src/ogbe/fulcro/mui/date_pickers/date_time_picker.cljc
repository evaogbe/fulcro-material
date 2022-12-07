(ns ogbe.fulcro.mui.date-pickers.date-time-picker
  #?(:cljs (:require
            ["@mui/x-date-pickers/DateTimePicker" :refer [DateTimePicker]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-date-time-picker #?(:clj  (fn [& _args])
                            :cljs (interop/react-factory DateTimePicker)))
