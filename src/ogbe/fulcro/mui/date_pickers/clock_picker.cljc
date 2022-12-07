(ns ogbe.fulcro.mui.date-pickers.clock-picker
  #?(:cljs (:require
            ["@mui/x-date-pickers/ClockPicker" :refer [ClockPicker]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-clock-picker #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory ClockPicker)))
