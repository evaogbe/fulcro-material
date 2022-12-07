(ns ogbe.fulcro.mui.icons.ballot-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BallotRounded" :default BallotRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-ballot-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BallotRounded)))