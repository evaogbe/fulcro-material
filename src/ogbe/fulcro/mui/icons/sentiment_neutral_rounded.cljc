(ns ogbe.fulcro.mui.icons.sentiment-neutral-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SentimentNeutralRounded" :default SentimentNeutralRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sentiment-neutral-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SentimentNeutralRounded)))