(ns ogbe.fulcro.mui.icons.emoji-emotions
  #?(:cljs (:require
            ["@mui/icons-material/EmojiEmotions" :default EmojiEmotions]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-emotions
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiEmotions)))