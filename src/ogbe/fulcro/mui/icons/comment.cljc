(ns ogbe.fulcro.mui.icons.comment
  #?(:cljs (:require
            ["@mui/icons-material/Comment" :default Comment]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-comment
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Comment)))