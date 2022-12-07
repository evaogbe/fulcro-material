(ns ogbe.fulcro.mui.icons.medication-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/MedicationTwoTone" :default MedicationTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-medication-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MedicationTwoTone)))