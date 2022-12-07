(ns ogbe.fulcro.mui.icons.tag-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TagSharp" :default TagSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tag-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TagSharp)))