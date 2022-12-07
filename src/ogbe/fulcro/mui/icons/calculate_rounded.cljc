(ns ogbe.fulcro.mui.icons.calculate-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CalculateRounded" :default CalculateRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-calculate-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CalculateRounded)))