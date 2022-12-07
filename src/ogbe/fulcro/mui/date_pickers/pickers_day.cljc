(ns ogbe.fulcro.mui.date-pickers.pickers-day
  #?(:cljs (:require
            ["@mui/x-date-pickers/PickersDay" :refer [PickersDay]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-pickers-day #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory PickersDay)))
