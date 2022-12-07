(ns ogbe.fulcro.mui.icons.emoji-objects-outlined
  #?(:cljs (:require
            ["@mui/icons-material/EmojiObjectsOutlined" :default EmojiObjectsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-objects-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiObjectsOutlined)))