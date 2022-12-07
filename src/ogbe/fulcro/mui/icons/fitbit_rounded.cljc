(ns ogbe.fulcro.mui.icons.fitbit-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FitbitRounded" :default FitbitRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fitbit-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FitbitRounded)))