(ns ogbe.fulcro.mui.icons.emoji-emotions-rounded
  #?(:cljs (:require
            ["@mui/icons-material/EmojiEmotionsRounded" :default EmojiEmotionsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-emotions-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiEmotionsRounded)))