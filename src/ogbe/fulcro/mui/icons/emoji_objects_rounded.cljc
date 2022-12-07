(ns ogbe.fulcro.mui.icons.emoji-objects-rounded
  #?(:cljs (:require
            ["@mui/icons-material/EmojiObjectsRounded" :default EmojiObjectsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-objects-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiObjectsRounded)))