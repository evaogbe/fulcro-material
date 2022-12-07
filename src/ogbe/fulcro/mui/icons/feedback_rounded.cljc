(ns ogbe.fulcro.mui.icons.feedback-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FeedbackRounded" :default FeedbackRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-feedback-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FeedbackRounded)))