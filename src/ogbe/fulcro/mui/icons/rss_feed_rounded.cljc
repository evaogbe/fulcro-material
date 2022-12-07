(ns ogbe.fulcro.mui.icons.rss-feed-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RssFeedRounded" :default RssFeedRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rss-feed-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RssFeedRounded)))