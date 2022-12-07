(ns ogbe.fulcro.mui.icons.collections-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CollectionsOutlined" :default CollectionsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-collections-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CollectionsOutlined)))