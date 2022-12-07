(ns ogbe.fulcro.mui.icons.emoji-symbols-rounded
  #?(:cljs (:require
            ["@mui/icons-material/EmojiSymbolsRounded" :default EmojiSymbolsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-symbols-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiSymbolsRounded)))