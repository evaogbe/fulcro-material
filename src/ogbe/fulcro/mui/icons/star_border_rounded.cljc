(ns ogbe.fulcro.mui.icons.star-border-rounded
  #?(:cljs (:require
            ["@mui/icons-material/StarBorderRounded" :default StarBorderRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-star-border-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StarBorderRounded)))