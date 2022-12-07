(ns ogbe.fulcro.mui.icons.dynamic-feed-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DynamicFeedRounded" :default DynamicFeedRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dynamic-feed-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DynamicFeedRounded)))