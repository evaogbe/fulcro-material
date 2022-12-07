(ns ogbe.fulcro.mui.icons.tag-faces-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TagFacesOutlined" :default TagFacesOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tag-faces-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TagFacesOutlined)))