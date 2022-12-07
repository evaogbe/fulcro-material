(ns ogbe.fulcro.mui.icons.collections-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CollectionsSharp" :default CollectionsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-collections-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CollectionsSharp)))