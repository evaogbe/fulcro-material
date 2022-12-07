(ns ogbe.fulcro.mui.icons.content-paste-go
  #?(:cljs (:require
            ["@mui/icons-material/ContentPasteGo" :default ContentPasteGo]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-content-paste-go
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContentPasteGo)))