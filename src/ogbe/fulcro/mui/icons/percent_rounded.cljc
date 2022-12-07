(ns ogbe.fulcro.mui.icons.percent-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PercentRounded" :default PercentRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-percent-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PercentRounded)))