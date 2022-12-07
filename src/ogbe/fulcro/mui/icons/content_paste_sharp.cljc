(ns ogbe.fulcro.mui.icons.content-paste-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ContentPasteSharp" :default ContentPasteSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-content-paste-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContentPasteSharp)))