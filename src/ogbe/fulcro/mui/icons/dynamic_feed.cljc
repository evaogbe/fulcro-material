(ns ogbe.fulcro.mui.icons.dynamic-feed
  #?(:cljs (:require
            ["@mui/icons-material/DynamicFeed" :default DynamicFeed]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dynamic-feed
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DynamicFeed)))