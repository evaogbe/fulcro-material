(ns ogbe.fulcro.mui.icons.how-to-vote
  #?(:cljs (:require
            ["@mui/icons-material/HowToVote" :default HowToVote]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-how-to-vote
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HowToVote)))