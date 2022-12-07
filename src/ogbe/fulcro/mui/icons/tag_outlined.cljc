(ns ogbe.fulcro.mui.icons.tag-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TagOutlined" :default TagOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tag-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TagOutlined)))