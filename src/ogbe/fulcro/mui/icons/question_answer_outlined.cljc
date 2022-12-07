(ns ogbe.fulcro.mui.icons.question-answer-outlined
  #?(:cljs (:require
            ["@mui/icons-material/QuestionAnswerOutlined" :default QuestionAnswerOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-question-answer-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QuestionAnswerOutlined)))