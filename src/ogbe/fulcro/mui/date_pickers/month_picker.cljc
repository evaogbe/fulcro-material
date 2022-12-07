(ns ogbe.fulcro.mui.date-pickers.month-picker
  #?(:cljs (:require
            ["@mui/x-date-pickers/MonthPicker" :refer [MonthPicker]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-month-picker #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory MonthPicker)))
