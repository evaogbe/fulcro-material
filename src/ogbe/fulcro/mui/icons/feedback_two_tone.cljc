(ns ogbe.fulcro.mui.icons.feedback-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/FeedbackTwoTone" :default FeedbackTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-feedback-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FeedbackTwoTone)))