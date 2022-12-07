(ns ogbe.fulcro.mui.icons.post-add
  #?(:cljs (:require
            ["@mui/icons-material/PostAdd" :default PostAdd]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-post-add
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PostAdd)))