(ns ogbe.fulcro.mui.icons.leaderboard
  #?(:cljs (:require
            ["@mui/icons-material/Leaderboard" :default Leaderboard]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-leaderboard
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Leaderboard)))