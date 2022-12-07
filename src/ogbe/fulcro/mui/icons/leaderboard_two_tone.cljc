(ns ogbe.fulcro.mui.icons.leaderboard-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/LeaderboardTwoTone" :default LeaderboardTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-leaderboard-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LeaderboardTwoTone)))