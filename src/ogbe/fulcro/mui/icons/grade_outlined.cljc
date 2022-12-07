(ns ogbe.fulcro.mui.icons.grade-outlined
  #?(:cljs (:require
            ["@mui/icons-material/GradeOutlined" :default GradeOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grade-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GradeOutlined)))