(ns ogbe.fulcro.mui.icons.emergency-share
  #?(:cljs (:require
            ["@mui/icons-material/EmergencyShare" :default EmergencyShare]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emergency-share
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmergencyShare)))