(ns ogbe.fulcro.mui.icons.comment-bank
  #?(:cljs (:require
            ["@mui/icons-material/CommentBank" :default CommentBank]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-comment-bank
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CommentBank)))