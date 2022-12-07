(ns ogbe.fulcro.mui.icons.gradient-rounded
  #?(:cljs (:require
            ["@mui/icons-material/GradientRounded" :default GradientRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gradient-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GradientRounded)))