(ns ogbe.fulcro.mui.date-pickers.desktop-date-time-picker
  #?(:cljs (:require
            ["@mui/x-date-pickers/DesktopDateTimePicker" :refer [DesktopDateTimePicker]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-desktop-date-time-picker #?(:clj  (fn [& _args])
                                    :cljs (interop/react-factory DesktopDateTimePicker)))
