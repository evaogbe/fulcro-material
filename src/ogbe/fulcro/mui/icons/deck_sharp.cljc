(ns ogbe.fulcro.mui.icons.deck-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DeckSharp" :default DeckSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-deck-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeckSharp)))