(ns ogbe.fulcro.mui.icons.question-mark-rounded
  #?(:cljs (:require
            ["@mui/icons-material/QuestionMarkRounded" :default QuestionMarkRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-question-mark-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QuestionMarkRounded)))