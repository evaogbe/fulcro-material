(ns ogbe.fulcro.mui.icons.catching-pokemon
  #?(:cljs (:require
            ["@mui/icons-material/CatchingPokemon" :default CatchingPokemon]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-catching-pokemon
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CatchingPokemon)))