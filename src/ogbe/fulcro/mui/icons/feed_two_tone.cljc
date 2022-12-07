(ns ogbe.fulcro.mui.icons.feed-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/FeedTwoTone" :default FeedTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-feed-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FeedTwoTone)))