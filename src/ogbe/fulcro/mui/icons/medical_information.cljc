(ns ogbe.fulcro.mui.icons.medical-information
  #?(:cljs (:require
            ["@mui/icons-material/MedicalInformation" :default MedicalInformation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-medical-information
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MedicalInformation)))