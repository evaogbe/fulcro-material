(ns ogbe.fulcro.mui.icons.deck
  #?(:cljs (:require
            ["@mui/icons-material/Deck" :default Deck]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-deck
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Deck)))