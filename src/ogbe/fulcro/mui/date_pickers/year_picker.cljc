(ns ogbe.fulcro.mui.date-pickers.year-picker
  #?(:cljs (:require
            ["@mui/x-date-pickers/YearPicker" :refer [YearPicker]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-year-picker #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory YearPicker)))
