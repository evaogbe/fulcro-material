(ns ogbe.fulcro.mui.icons.emoji-symbols-sharp
  #?(:cljs (:require
            ["@mui/icons-material/EmojiSymbolsSharp" :default EmojiSymbolsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-symbols-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiSymbolsSharp)))