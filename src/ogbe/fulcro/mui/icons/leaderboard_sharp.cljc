(ns ogbe.fulcro.mui.icons.leaderboard-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LeaderboardSharp" :default LeaderboardSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-leaderboard-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LeaderboardSharp)))