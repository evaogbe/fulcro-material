(ns ogbe.fulcro.mui.icons.movie-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MovieOutlined" :default MovieOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-movie-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MovieOutlined)))