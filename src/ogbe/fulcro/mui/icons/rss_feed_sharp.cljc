(ns ogbe.fulcro.mui.icons.rss-feed-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RssFeedSharp" :default RssFeedSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rss-feed-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RssFeedSharp)))