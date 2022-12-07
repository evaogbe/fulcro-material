(ns ogbe.fulcro.mui.icons.wysiwyg-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/WysiwygTwoTone" :default WysiwygTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wysiwyg-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WysiwygTwoTone)))