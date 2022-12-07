(ns ogbe.fulcro.mui.icons.quiz-rounded
  #?(:cljs (:require
            ["@mui/icons-material/QuizRounded" :default QuizRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-quiz-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QuizRounded)))