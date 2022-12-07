(ns ogbe.fulcro.mui.icons.star-rounded
  #?(:cljs (:require
            ["@mui/icons-material/StarRounded" :default StarRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-star-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StarRounded)))