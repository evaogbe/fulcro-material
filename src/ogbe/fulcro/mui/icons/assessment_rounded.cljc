(ns ogbe.fulcro.mui.icons.assessment-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AssessmentRounded" :default AssessmentRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-assessment-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AssessmentRounded)))