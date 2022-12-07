(ns ogbe.fulcro.mui.icons.scoreboard-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ScoreboardOutlined" :default ScoreboardOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-scoreboard-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScoreboardOutlined)))