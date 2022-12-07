(ns ogbe.fulcro.mui.icons.wysiwyg-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WysiwygOutlined" :default WysiwygOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wysiwyg-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WysiwygOutlined)))