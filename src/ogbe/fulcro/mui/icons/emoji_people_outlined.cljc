(ns ogbe.fulcro.mui.icons.emoji-people-outlined
  #?(:cljs (:require
            ["@mui/icons-material/EmojiPeopleOutlined" :default EmojiPeopleOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-people-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiPeopleOutlined)))