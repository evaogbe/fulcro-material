(ns ogbe.fulcro.mui.icons.comment-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CommentSharp" :default CommentSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-comment-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CommentSharp)))