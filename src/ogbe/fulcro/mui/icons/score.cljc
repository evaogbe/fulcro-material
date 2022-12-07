(ns ogbe.fulcro.mui.icons.score
  #?(:cljs (:require
            ["@mui/icons-material/Score" :default Score]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-score
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Score)))