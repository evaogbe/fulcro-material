(ns ogbe.fulcro.mui.icons.post-add-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PostAddSharp" :default PostAddSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-post-add-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PostAddSharp)))