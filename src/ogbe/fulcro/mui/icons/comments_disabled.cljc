(ns ogbe.fulcro.mui.icons.comments-disabled
  #?(:cljs (:require
            ["@mui/icons-material/CommentsDisabled" :default CommentsDisabled]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-comments-disabled
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CommentsDisabled)))