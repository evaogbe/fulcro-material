(ns ogbe.fulcro.mui.icons.thumb-down-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ThumbDownRounded" :default ThumbDownRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-thumb-down-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThumbDownRounded)))