(ns ogbe.fulcro.mui.icons.movie-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MovieRounded" :default MovieRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-movie-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MovieRounded)))