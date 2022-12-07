(ns ogbe.fulcro.mui.icons.highlight-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HighlightSharp" :default HighlightSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-highlight-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HighlightSharp)))