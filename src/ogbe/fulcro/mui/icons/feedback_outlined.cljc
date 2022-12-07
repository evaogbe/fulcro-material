(ns ogbe.fulcro.mui.icons.feedback-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FeedbackOutlined" :default FeedbackOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-feedback-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FeedbackOutlined)))