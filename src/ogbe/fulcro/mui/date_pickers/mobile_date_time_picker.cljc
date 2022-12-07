(ns ogbe.fulcro.mui.date-pickers.mobile-date-time-picker
  #?(:cljs (:require
            ["@mui/x-date-pickers/MobileDateTimePicker" :refer [MobileDateTimePicker]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-mobile-date-time-picker #?(:clj  (fn [& _args])
                                   :cljs (interop/react-factory MobileDateTimePicker)))
