(ns ogbe.fulcro.mui.date-pickers.date-picker
  #?(:cljs (:require
            ["@mui/x-date-pickers/DatePicker" :refer [DatePicker]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-date-picker #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory DatePicker)))
