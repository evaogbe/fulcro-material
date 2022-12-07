(ns ogbe.fulcro.mui.icons.terrain-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TerrainOutlined" :default TerrainOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-terrain-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TerrainOutlined)))