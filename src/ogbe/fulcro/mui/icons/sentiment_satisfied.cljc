(ns ogbe.fulcro.mui.icons.sentiment-satisfied
  #?(:cljs (:require
            ["@mui/icons-material/SentimentSatisfied" :default SentimentSatisfied]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sentiment-satisfied
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SentimentSatisfied)))