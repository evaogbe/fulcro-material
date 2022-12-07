(ns ogbe.fulcro.mui.date-pickers.mobile-date-picker
  #?(:cljs (:require
            ["@mui/x-date-pickers/MobileDatePicker" :refer [MobileDatePicker]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-mobile-date-picker #?(:clj  (fn [& _args])
                              :cljs (interop/react-factory MobileDatePicker)))
