(ns ogbe.fulcro.mui.icons.emoji-nature
  #?(:cljs (:require
            ["@mui/icons-material/EmojiNature" :default EmojiNature]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-nature
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiNature)))