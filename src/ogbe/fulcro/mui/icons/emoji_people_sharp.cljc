(ns ogbe.fulcro.mui.icons.emoji-people-sharp
  #?(:cljs (:require
            ["@mui/icons-material/EmojiPeopleSharp" :default EmojiPeopleSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-people-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiPeopleSharp)))