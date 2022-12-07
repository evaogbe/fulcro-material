(ns ogbe.fulcro.mui.icons.medication-liquid
  #?(:cljs (:require
            ["@mui/icons-material/MedicationLiquid" :default MedicationLiquid]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-medication-liquid
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MedicationLiquid)))