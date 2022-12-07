(ns ogbe.fulcro.mui.icons.movie-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MovieSharp" :default MovieSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-movie-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MovieSharp)))