(ns ogbe.fulcro.mui.icons.mediation
  #?(:cljs (:require
            ["@mui/icons-material/Mediation" :default Mediation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mediation
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Mediation)))