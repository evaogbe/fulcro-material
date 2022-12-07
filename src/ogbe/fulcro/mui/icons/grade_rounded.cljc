(ns ogbe.fulcro.mui.icons.grade-rounded
  #?(:cljs (:require
            ["@mui/icons-material/GradeRounded" :default GradeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grade-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GradeRounded)))