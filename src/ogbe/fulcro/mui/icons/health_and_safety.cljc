(ns ogbe.fulcro.mui.icons.health-and-safety
  #?(:cljs (:require
            ["@mui/icons-material/HealthAndSafety" :default HealthAndSafety]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-health-and-safety
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HealthAndSafety)))