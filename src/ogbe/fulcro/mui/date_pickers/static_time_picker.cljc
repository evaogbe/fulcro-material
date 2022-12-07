(ns ogbe.fulcro.mui.date-pickers.static-time-picker
  #?(:cljs (:require
            ["@mui/x-date-pickers/StaticTimePicker" :refer [StaticTimePicker]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-static-time-picker #?(:clj  (fn [& _args])
                              :cljs (interop/react-factory StaticTimePicker)))
