(ns ogbe.fulcro.mui.icons.games
  #?(:cljs (:require
            ["@mui/icons-material/Games" :default Games]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-games
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Games)))