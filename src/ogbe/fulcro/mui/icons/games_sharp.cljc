(ns ogbe.fulcro.mui.icons.games-sharp
  #?(:cljs (:require
            ["@mui/icons-material/GamesSharp" :default GamesSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-games-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GamesSharp)))