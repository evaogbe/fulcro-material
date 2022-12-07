(ns ogbe.fulcro.mui.icons.sentiment-neutral-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SentimentNeutralSharp" :default SentimentNeutralSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sentiment-neutral-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SentimentNeutralSharp)))