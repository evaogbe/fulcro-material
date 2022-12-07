(ns ogbe.fulcro.mui.icons.forum-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ForumSharp" :default ForumSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-forum-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ForumSharp)))