(ns ogbe.fulcro.mui.icons.post-add-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PostAddRounded" :default PostAddRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-post-add-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PostAddRounded)))