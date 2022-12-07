(ns ogbe.fulcro.mui.icons.text-snippet-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TextSnippetSharp" :default TextSnippetSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-text-snippet-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TextSnippetSharp)))