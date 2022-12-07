(ns ogbe.fulcro.mui.icons.question-answer
  #?(:cljs (:require
            ["@mui/icons-material/QuestionAnswer" :default QuestionAnswer]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-question-answer
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QuestionAnswer)))