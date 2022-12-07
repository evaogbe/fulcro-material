(ns ogbe.fulcro.mui.icons.question-mark-outlined
  #?(:cljs (:require
            ["@mui/icons-material/QuestionMarkOutlined" :default QuestionMarkOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-question-mark-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QuestionMarkOutlined)))