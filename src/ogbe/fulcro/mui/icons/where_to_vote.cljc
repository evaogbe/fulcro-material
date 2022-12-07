(ns ogbe.fulcro.mui.icons.where-to-vote
  #?(:cljs (:require
            ["@mui/icons-material/WhereToVote" :default WhereToVote]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-where-to-vote
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WhereToVote)))