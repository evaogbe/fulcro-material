(ns ogbe.fulcro.mui.icons.emoji-flags
  #?(:cljs (:require
            ["@mui/icons-material/EmojiFlags" :default EmojiFlags]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-flags
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiFlags)))