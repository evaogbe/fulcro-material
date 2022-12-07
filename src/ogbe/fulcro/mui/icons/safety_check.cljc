(ns ogbe.fulcro.mui.icons.safety-check
  #?(:cljs (:require
            ["@mui/icons-material/SafetyCheck" :default SafetyCheck]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-safety-check
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SafetyCheck)))