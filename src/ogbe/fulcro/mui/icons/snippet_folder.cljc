(ns ogbe.fulcro.mui.icons.snippet-folder
  #?(:cljs (:require
            ["@mui/icons-material/SnippetFolder" :default SnippetFolder]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-snippet-folder
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SnippetFolder)))