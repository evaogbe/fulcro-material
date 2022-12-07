(ns ogbe.fulcro.mui.icons.tag-faces-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TagFacesRounded" :default TagFacesRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tag-faces-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TagFacesRounded)))