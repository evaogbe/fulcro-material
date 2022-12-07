(ns ogbe.fulcro.mui.icons.favorite-border
  #?(:cljs (:require
            ["@mui/icons-material/FavoriteBorder" :default FavoriteBorder]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-favorite-border
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FavoriteBorder)))