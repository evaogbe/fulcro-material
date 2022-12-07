(ns ogbe.fulcro.mui.icons.wysiwyg
  #?(:cljs (:require
            ["@mui/icons-material/Wysiwyg" :default Wysiwyg]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wysiwyg
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Wysiwyg)))