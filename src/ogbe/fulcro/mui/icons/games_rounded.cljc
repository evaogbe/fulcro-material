(ns ogbe.fulcro.mui.icons.games-rounded
  #?(:cljs (:require
            ["@mui/icons-material/GamesRounded" :default GamesRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-games-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GamesRounded)))