(ns ogbe.fulcro.mui.date-pickers.time-picker
  #?(:cljs (:require
            ["@mui/x-date-pickers/TimePicker" :refer [TimePicker]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-time-picker #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory TimePicker)))
