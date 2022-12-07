(ns ogbe.fulcro.mui.icons.forum-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ForumOutlined" :default ForumOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-forum-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ForumOutlined)))