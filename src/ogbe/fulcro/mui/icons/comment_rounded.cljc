(ns ogbe.fulcro.mui.icons.comment-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CommentRounded" :default CommentRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-comment-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CommentRounded)))