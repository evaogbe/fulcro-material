(ns ogbe.fulcro.mui.icons.local-movies-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LocalMoviesSharp" :default LocalMoviesSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-movies-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalMoviesSharp)))