(ns ogbe.fulcro.mui.icons.tag-faces
  #?(:cljs (:require
            ["@mui/icons-material/TagFaces" :default TagFaces]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tag-faces
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TagFaces)))