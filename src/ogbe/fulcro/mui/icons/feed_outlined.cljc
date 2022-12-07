(ns ogbe.fulcro.mui.icons.feed-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FeedOutlined" :default FeedOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-feed-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FeedOutlined)))