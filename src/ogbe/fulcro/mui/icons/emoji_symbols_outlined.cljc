(ns ogbe.fulcro.mui.icons.emoji-symbols-outlined
  #?(:cljs (:require
            ["@mui/icons-material/EmojiSymbolsOutlined" :default EmojiSymbolsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-symbols-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiSymbolsOutlined)))