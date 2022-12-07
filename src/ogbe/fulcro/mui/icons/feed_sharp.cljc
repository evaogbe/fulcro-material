(ns ogbe.fulcro.mui.icons.feed-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FeedSharp" :default FeedSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-feed-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FeedSharp)))