(ns ogbe.fulcro.mui.icons.emoji-transportation
  #?(:cljs (:require
            ["@mui/icons-material/EmojiTransportation" :default EmojiTransportation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-transportation
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiTransportation)))