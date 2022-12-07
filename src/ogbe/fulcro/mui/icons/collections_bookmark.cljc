(ns ogbe.fulcro.mui.icons.collections-bookmark
  #?(:cljs (:require
            ["@mui/icons-material/CollectionsBookmark" :default CollectionsBookmark]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-collections-bookmark
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CollectionsBookmark)))