(ns ogbe.fulcro.mui.date-pickers.desktop-time-picker
  #?(:cljs (:require
            ["@mui/x-date-pickers/DesktopTimePicker" :refer [DesktopTimePicker]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-desktop-time-picker #?(:clj  (fn [& _args])
                               :cljs (interop/react-factory DesktopTimePicker)))
