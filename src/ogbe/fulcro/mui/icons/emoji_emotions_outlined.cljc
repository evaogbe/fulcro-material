(ns ogbe.fulcro.mui.icons.emoji-emotions-outlined
  #?(:cljs (:require
            ["@mui/icons-material/EmojiEmotionsOutlined" :default EmojiEmotionsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-emotions-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiEmotionsOutlined)))