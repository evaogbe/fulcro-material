(ns ogbe.fulcro.mui.icons.quiz-outlined
  #?(:cljs (:require
            ["@mui/icons-material/QuizOutlined" :default QuizOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-quiz-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QuizOutlined)))