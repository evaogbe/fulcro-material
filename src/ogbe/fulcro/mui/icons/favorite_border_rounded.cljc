(ns ogbe.fulcro.mui.icons.favorite-border-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FavoriteBorderRounded" :default FavoriteBorderRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-favorite-border-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FavoriteBorderRounded)))