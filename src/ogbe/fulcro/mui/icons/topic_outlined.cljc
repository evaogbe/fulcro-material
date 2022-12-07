(ns ogbe.fulcro.mui.icons.topic-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TopicOutlined" :default TopicOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-topic-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TopicOutlined)))