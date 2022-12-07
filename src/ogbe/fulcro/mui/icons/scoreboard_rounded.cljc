(ns ogbe.fulcro.mui.icons.scoreboard-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ScoreboardRounded" :default ScoreboardRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-scoreboard-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScoreboardRounded)))