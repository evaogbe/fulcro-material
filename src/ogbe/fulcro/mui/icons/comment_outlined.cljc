(ns ogbe.fulcro.mui.icons.comment-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CommentOutlined" :default CommentOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-comment-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CommentOutlined)))