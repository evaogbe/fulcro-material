(ns ogbe.fulcro.mui.icons.wysiwyg-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WysiwygSharp" :default WysiwygSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wysiwyg-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WysiwygSharp)))