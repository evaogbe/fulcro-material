(ns ogbe.fulcro.mui.date-pickers.static-date-time-picker
  #?(:cljs (:require
            ["@mui/x-date-pickers/StaticDateTimePicker" :refer [StaticDateTimePicker]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-static-date-time-picker #?(:clj  (fn [& _args])
                                   :cljs (interop/react-factory StaticDateTimePicker)))
