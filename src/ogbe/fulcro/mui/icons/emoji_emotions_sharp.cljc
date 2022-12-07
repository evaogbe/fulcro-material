(ns ogbe.fulcro.mui.icons.emoji-emotions-sharp
  #?(:cljs (:require
            ["@mui/icons-material/EmojiEmotionsSharp" :default EmojiEmotionsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-emotions-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiEmotionsSharp)))