(ns ogbe.fulcro.mui.icons.scoreboard-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ScoreboardSharp" :default ScoreboardSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-scoreboard-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScoreboardSharp)))