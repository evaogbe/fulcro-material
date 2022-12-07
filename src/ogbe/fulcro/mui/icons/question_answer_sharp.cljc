(ns ogbe.fulcro.mui.icons.question-answer-sharp
  #?(:cljs (:require
            ["@mui/icons-material/QuestionAnswerSharp" :default QuestionAnswerSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-question-answer-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QuestionAnswerSharp)))