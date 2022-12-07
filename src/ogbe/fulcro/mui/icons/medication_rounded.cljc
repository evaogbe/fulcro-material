(ns ogbe.fulcro.mui.icons.medication-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MedicationRounded" :default MedicationRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-medication-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MedicationRounded)))