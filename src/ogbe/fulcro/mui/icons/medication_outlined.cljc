(ns ogbe.fulcro.mui.icons.medication-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MedicationOutlined" :default MedicationOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-medication-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MedicationOutlined)))