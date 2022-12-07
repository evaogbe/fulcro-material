(ns ogbe.fulcro.mui.icons.emoji-people
  #?(:cljs (:require
            ["@mui/icons-material/EmojiPeople" :default EmojiPeople]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-people
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiPeople)))