(ns ogbe.fulcro.mui.icons.movie-filter
  #?(:cljs (:require
            ["@mui/icons-material/MovieFilter" :default MovieFilter]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-movie-filter
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MovieFilter)))