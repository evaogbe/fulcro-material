(ns ogbe.fulcro.mui.icons.local-hospital
  #?(:cljs (:require
            ["@mui/icons-material/LocalHospital" :default LocalHospital]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-hospital
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalHospital)))