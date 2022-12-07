(ns ogbe.fulcro.mui.icons.safety-divider
  #?(:cljs (:require
            ["@mui/icons-material/SafetyDivider" :default SafetyDivider]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-safety-divider
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SafetyDivider)))