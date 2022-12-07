(ns ogbe.fulcro.mui.icons.score-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ScoreRounded" :default ScoreRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-score-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScoreRounded)))