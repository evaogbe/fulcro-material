(ns ogbe.fulcro.mui.icons.deck-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DeckOutlined" :default DeckOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-deck-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeckOutlined)))