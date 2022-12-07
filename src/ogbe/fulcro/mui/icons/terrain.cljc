(ns ogbe.fulcro.mui.icons.terrain
  #?(:cljs (:require
            ["@mui/icons-material/Terrain" :default Terrain]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-terrain
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Terrain)))