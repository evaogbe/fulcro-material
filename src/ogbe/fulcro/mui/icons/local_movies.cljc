(ns ogbe.fulcro.mui.icons.local-movies
  #?(:cljs (:require
            ["@mui/icons-material/LocalMovies" :default LocalMovies]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-movies
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalMovies)))