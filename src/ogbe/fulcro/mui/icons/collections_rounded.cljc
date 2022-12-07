(ns ogbe.fulcro.mui.icons.collections-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CollectionsRounded" :default CollectionsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-collections-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CollectionsRounded)))