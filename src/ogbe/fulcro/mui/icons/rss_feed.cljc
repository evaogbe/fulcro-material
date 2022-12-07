(ns ogbe.fulcro.mui.icons.rss-feed
  #?(:cljs (:require
            ["@mui/icons-material/RssFeed" :default RssFeed]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rss-feed
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RssFeed)))