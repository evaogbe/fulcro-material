(ns ogbe.fulcro.mui.icons.medical-services
  #?(:cljs (:require
            ["@mui/icons-material/MedicalServices" :default MedicalServices]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-medical-services
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MedicalServices)))