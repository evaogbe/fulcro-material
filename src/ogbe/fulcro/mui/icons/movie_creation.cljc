(ns ogbe.fulcro.mui.icons.movie-creation
  #?(:cljs (:require
            ["@mui/icons-material/MovieCreation" :default MovieCreation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-movie-creation
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MovieCreation)))