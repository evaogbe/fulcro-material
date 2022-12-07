(ns ogbe.fulcro.mui.icons.cell-tower
  #?(:cljs (:require
            ["@mui/icons-material/CellTower" :default CellTower]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cell-tower
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CellTower)))