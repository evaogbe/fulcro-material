(ns ogbe.fulcro.mui.icons.emoji-events
  #?(:cljs (:require
            ["@mui/icons-material/EmojiEvents" :default EmojiEvents]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-events
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiEvents)))