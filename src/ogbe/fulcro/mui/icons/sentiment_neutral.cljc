(ns ogbe.fulcro.mui.icons.sentiment-neutral
  #?(:cljs (:require
            ["@mui/icons-material/SentimentNeutral" :default SentimentNeutral]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sentiment-neutral
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SentimentNeutral)))