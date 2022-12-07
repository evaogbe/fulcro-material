(ns ogbe.fulcro.mui.icons.scoreboard
  #?(:cljs (:require
            ["@mui/icons-material/Scoreboard" :default Scoreboard]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-scoreboard
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Scoreboard)))