(ns ogbe.fulcro.mui.icons.grid-view
  #?(:cljs (:require
            ["@mui/icons-material/GridView" :default GridView]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grid-view
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GridView)))