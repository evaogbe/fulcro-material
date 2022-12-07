(ns ogbe.fulcro.mui.icons.dynamic-feed-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DynamicFeedSharp" :default DynamicFeedSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dynamic-feed-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DynamicFeedSharp)))