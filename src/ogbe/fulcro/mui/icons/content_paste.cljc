(ns ogbe.fulcro.mui.icons.content-paste
  #?(:cljs (:require
            ["@mui/icons-material/ContentPaste" :default ContentPaste]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-content-paste
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContentPaste)))