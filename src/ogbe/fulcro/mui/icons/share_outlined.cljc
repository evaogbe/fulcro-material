(ns ogbe.fulcro.mui.icons.share-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ShareOutlined" :default ShareOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-share-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShareOutlined)))