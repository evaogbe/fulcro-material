(ns ogbe.fulcro.mui.icons.thumb-up-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ThumbUpRounded" :default ThumbUpRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-thumb-up-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThumbUpRounded)))