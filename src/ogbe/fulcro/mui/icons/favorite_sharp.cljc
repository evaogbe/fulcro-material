(ns ogbe.fulcro.mui.icons.favorite-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FavoriteSharp" :default FavoriteSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-favorite-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FavoriteSharp)))