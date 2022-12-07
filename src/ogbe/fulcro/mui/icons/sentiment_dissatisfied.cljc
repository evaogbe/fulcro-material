(ns ogbe.fulcro.mui.icons.sentiment-dissatisfied
  #?(:cljs (:require
            ["@mui/icons-material/SentimentDissatisfied" :default SentimentDissatisfied]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sentiment-dissatisfied
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SentimentDissatisfied)))