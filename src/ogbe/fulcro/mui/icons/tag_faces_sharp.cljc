(ns ogbe.fulcro.mui.icons.tag-faces-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TagFacesSharp" :default TagFacesSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tag-faces-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TagFacesSharp)))