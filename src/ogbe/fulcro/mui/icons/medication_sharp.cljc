(ns ogbe.fulcro.mui.icons.medication-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MedicationSharp" :default MedicationSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-medication-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MedicationSharp)))