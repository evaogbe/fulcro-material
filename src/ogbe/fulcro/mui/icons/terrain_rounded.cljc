(ns ogbe.fulcro.mui.icons.terrain-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TerrainRounded" :default TerrainRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-terrain-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TerrainRounded)))