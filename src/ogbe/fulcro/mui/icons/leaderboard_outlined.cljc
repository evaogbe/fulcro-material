(ns ogbe.fulcro.mui.icons.leaderboard-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LeaderboardOutlined" :default LeaderboardOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-leaderboard-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LeaderboardOutlined)))