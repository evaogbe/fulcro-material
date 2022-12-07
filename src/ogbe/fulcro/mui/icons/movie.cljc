(ns ogbe.fulcro.mui.icons.movie
  #?(:cljs (:require
            ["@mui/icons-material/Movie" :default Movie]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-movie
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Movie)))