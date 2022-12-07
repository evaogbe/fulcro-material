(ns ogbe.fulcro.mui.icons.commit-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CommitRounded" :default CommitRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-commit-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CommitRounded)))