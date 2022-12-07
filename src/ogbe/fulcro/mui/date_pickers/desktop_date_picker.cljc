(ns ogbe.fulcro.mui.date-pickers.desktop-date-picker
  #?(:cljs (:require
            ["@mui/x-date-pickers/DesktopDatePicker" :refer [DesktopDatePicker]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-desktop-date-picker #?(:clj  (fn [& _args])
                               :cljs (interop/react-factory DesktopDatePicker)))
