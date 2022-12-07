(ns ogbe.fulcro.mui.icons.grain-rounded
  #?(:cljs (:require
            ["@mui/icons-material/GrainRounded" :default GrainRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grain-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GrainRounded)))