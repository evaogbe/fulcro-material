(ns ogbe.fulcro.mui.icons.tag-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TagRounded" :default TagRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tag-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TagRounded)))