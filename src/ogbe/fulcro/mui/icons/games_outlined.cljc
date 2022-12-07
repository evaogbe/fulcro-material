(ns ogbe.fulcro.mui.icons.games-outlined
  #?(:cljs (:require
            ["@mui/icons-material/GamesOutlined" :default GamesOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-games-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GamesOutlined)))