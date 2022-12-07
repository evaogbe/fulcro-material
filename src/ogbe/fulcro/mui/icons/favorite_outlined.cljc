(ns ogbe.fulcro.mui.icons.favorite-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FavoriteOutlined" :default FavoriteOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-favorite-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FavoriteOutlined)))