(ns ogbe.fulcro.mui.date-pickers.static-date-picker
  #?(:cljs (:require
            ["@mui/x-date-pickers/StaticDatePicker" :refer [StaticDatePicker]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-static-date-picker #?(:clj  (fn [& _args])
                              :cljs (interop/react-factory StaticDatePicker)))
