(ns ogbe.fulcro.mui.icons.zoom-in-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ZoomInSharp" :default ZoomInSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-zoom-in-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ZoomInSharp)))