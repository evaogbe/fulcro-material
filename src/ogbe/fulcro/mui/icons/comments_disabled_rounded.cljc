(ns ogbe.fulcro.mui.icons.comments-disabled-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CommentsDisabledRounded" :default CommentsDisabledRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-comments-disabled-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CommentsDisabledRounded)))