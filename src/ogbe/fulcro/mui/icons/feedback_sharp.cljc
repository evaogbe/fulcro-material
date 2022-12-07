(ns ogbe.fulcro.mui.icons.feedback-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FeedbackSharp" :default FeedbackSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-feedback-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FeedbackSharp)))