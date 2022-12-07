(ns ogbe.fulcro.mui.icons.sentiment-very-satisfied
  #?(:cljs (:require
            ["@mui/icons-material/SentimentVerySatisfied" :default SentimentVerySatisfied]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sentiment-very-satisfied
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SentimentVerySatisfied)))