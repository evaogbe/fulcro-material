(ns ogbe.fulcro.mui.icons.turn-left
  #?(:cljs (:require
            ["@mui/icons-material/TurnLeft" :default TurnLeft]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-turn-left
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TurnLeft)))