(ns ogbe.fulcro.mui.icons.question-mark-sharp
  #?(:cljs (:require
            ["@mui/icons-material/QuestionMarkSharp" :default QuestionMarkSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-question-mark-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QuestionMarkSharp)))