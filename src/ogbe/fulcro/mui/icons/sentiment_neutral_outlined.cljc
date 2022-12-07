(ns ogbe.fulcro.mui.icons.sentiment-neutral-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SentimentNeutralOutlined" :default SentimentNeutralOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sentiment-neutral-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SentimentNeutralOutlined)))