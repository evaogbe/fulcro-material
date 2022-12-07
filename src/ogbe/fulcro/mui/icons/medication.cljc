(ns ogbe.fulcro.mui.icons.medication
  #?(:cljs (:require
            ["@mui/icons-material/Medication" :default Medication]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-medication
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Medication)))