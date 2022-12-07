(ns ogbe.fulcro.mui.icons.dynamic-feed-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/DynamicFeedTwoTone" :default DynamicFeedTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dynamic-feed-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DynamicFeedTwoTone)))