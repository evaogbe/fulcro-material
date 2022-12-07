(ns ogbe.fulcro.mui.icons.grading-rounded
  #?(:cljs (:require
            ["@mui/icons-material/GradingRounded" :default GradingRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grading-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GradingRounded)))