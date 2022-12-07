(ns ogbe.fulcro.mui.date-pickers.mobile-time-picker
  #?(:cljs (:require
            ["@mui/x-date-pickers/MobileTimePicker" :refer [MobileTimePicker]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-mobile-time-picker #?(:clj  (fn [& _args])
                              :cljs (interop/react-factory MobileTimePicker)))
