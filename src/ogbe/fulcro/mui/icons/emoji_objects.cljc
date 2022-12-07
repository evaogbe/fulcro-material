(ns ogbe.fulcro.mui.icons.emoji-objects
  #?(:cljs (:require
            ["@mui/icons-material/EmojiObjects" :default EmojiObjects]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-objects
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiObjects)))