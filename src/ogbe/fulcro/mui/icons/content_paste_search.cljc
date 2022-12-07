(ns ogbe.fulcro.mui.icons.content-paste-search
  #?(:cljs (:require
            ["@mui/icons-material/ContentPasteSearch" :default ContentPasteSearch]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-content-paste-search
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContentPasteSearch)))