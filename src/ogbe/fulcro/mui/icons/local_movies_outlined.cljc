(ns ogbe.fulcro.mui.icons.local-movies-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LocalMoviesOutlined" :default LocalMoviesOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-movies-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalMoviesOutlined)))