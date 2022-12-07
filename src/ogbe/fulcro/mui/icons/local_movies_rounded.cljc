(ns ogbe.fulcro.mui.icons.local-movies-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LocalMoviesRounded" :default LocalMoviesRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-movies-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalMoviesRounded)))