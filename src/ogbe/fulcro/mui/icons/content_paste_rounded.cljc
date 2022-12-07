(ns ogbe.fulcro.mui.icons.content-paste-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ContentPasteRounded" :default ContentPasteRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-content-paste-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContentPasteRounded)))