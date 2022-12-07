(ns ogbe.fulcro.mui.icons.quiz-sharp
  #?(:cljs (:require
            ["@mui/icons-material/QuizSharp" :default QuizSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-quiz-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QuizSharp)))