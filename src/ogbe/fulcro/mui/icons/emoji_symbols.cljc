(ns ogbe.fulcro.mui.icons.emoji-symbols
  #?(:cljs (:require
            ["@mui/icons-material/EmojiSymbols" :default EmojiSymbols]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-symbols
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiSymbols)))