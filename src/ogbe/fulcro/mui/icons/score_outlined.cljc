(ns ogbe.fulcro.mui.icons.score-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ScoreOutlined" :default ScoreOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-score-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScoreOutlined)))