(ns ogbe.fulcro.mui.icons.text-snippet
  #?(:cljs (:require
            ["@mui/icons-material/TextSnippet" :default TextSnippet]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-text-snippet
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TextSnippet)))