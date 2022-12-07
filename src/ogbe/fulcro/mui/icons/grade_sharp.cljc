(ns ogbe.fulcro.mui.icons.grade-sharp
  #?(:cljs (:require
            ["@mui/icons-material/GradeSharp" :default GradeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grade-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GradeSharp)))