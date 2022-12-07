(ns ogbe.fulcro.mui.icons.feed
  #?(:cljs (:require
            ["@mui/icons-material/Feed" :default Feed]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-feed
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Feed)))