(ns ogbe.fulcro.mui.icons.feed-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FeedRounded" :default FeedRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-feed-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FeedRounded)))