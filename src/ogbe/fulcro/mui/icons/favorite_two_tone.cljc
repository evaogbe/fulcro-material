(ns ogbe.fulcro.mui.icons.favorite-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/FavoriteTwoTone" :default FavoriteTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-favorite-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FavoriteTwoTone)))