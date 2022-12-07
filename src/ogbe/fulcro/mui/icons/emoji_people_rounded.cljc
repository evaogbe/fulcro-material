(ns ogbe.fulcro.mui.icons.emoji-people-rounded
  #?(:cljs (:require
            ["@mui/icons-material/EmojiPeopleRounded" :default EmojiPeopleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-people-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiPeopleRounded)))