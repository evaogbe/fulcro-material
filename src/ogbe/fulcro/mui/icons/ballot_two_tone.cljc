(ns ogbe.fulcro.mui.icons.ballot-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/BallotTwoTone" :default BallotTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-ballot-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BallotTwoTone)))