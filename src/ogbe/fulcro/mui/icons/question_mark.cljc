(ns ogbe.fulcro.mui.icons.question-mark
  #?(:cljs (:require
            ["@mui/icons-material/QuestionMark" :default QuestionMark]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-question-mark
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QuestionMark)))