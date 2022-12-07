(ns ogbe.fulcro.mui.icons.favorite-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FavoriteRounded" :default FavoriteRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-favorite-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FavoriteRounded)))