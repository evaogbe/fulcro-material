(ns ogbe.fulcro.mui.icons.emoji-objects-sharp
  #?(:cljs (:require
            ["@mui/icons-material/EmojiObjectsSharp" :default EmojiObjectsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-objects-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiObjectsSharp)))