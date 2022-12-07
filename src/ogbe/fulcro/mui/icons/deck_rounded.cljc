(ns ogbe.fulcro.mui.icons.deck-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DeckRounded" :default DeckRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-deck-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeckRounded)))