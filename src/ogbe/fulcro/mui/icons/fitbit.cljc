(ns ogbe.fulcro.mui.icons.fitbit
  #?(:cljs (:require
            ["@mui/icons-material/Fitbit" :default Fitbit]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fitbit
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Fitbit)))