(ns ogbe.fulcro.mui.icons.fitness-center
  #?(:cljs (:require
            ["@mui/icons-material/FitnessCenter" :default FitnessCenter]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fitness-center
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FitnessCenter)))