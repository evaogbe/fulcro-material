(ns ogbe.fulcro.mui.icons.gavel-rounded
  #?(:cljs (:require
            ["@mui/icons-material/GavelRounded" :default GavelRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gavel-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GavelRounded)))