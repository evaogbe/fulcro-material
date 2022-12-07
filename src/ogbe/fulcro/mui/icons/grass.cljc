(ns ogbe.fulcro.mui.icons.grass
  #?(:cljs (:require
            ["@mui/icons-material/Grass" :default Grass]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grass
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Grass)))