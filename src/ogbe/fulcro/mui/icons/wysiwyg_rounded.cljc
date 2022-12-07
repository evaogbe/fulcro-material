(ns ogbe.fulcro.mui.icons.wysiwyg-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WysiwygRounded" :default WysiwygRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wysiwyg-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WysiwygRounded)))