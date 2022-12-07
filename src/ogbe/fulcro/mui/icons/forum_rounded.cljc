(ns ogbe.fulcro.mui.icons.forum-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ForumRounded" :default ForumRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-forum-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ForumRounded)))