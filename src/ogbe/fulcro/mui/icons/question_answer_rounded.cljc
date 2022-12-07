(ns ogbe.fulcro.mui.icons.question-answer-rounded
  #?(:cljs (:require
            ["@mui/icons-material/QuestionAnswerRounded" :default QuestionAnswerRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-question-answer-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QuestionAnswerRounded)))