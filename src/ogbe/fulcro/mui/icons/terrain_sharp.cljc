(ns ogbe.fulcro.mui.icons.terrain-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TerrainSharp" :default TerrainSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-terrain-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TerrainSharp)))