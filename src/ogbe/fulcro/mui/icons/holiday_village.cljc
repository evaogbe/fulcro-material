(ns ogbe.fulcro.mui.icons.holiday-village
  #?(:cljs (:require
            ["@mui/icons-material/HolidayVillage" :default HolidayVillage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-holiday-village
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HolidayVillage)))