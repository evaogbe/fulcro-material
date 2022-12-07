(ns ogbe.fulcro.mui.icons.topic-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TopicRounded" :default TopicRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-topic-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TopicRounded)))