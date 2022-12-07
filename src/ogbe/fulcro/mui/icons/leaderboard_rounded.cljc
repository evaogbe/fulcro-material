(ns ogbe.fulcro.mui.icons.leaderboard-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LeaderboardRounded" :default LeaderboardRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-leaderboard-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LeaderboardRounded)))