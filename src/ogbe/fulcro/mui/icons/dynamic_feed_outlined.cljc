(ns ogbe.fulcro.mui.icons.dynamic-feed-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DynamicFeedOutlined" :default DynamicFeedOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dynamic-feed-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DynamicFeedOutlined)))