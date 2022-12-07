(ns ogbe.fulcro.mui.icons.score-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ScoreSharp" :default ScoreSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-score-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScoreSharp)))