(ns ogbe.fulcro.mui.icons.hvac
  #?(:cljs (:require
            ["@mui/icons-material/Hvac" :default Hvac]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hvac
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Hvac)))