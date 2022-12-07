(ns ogbe.fulcro.mui.icons.grid-goldenratio
  #?(:cljs (:require
            ["@mui/icons-material/GridGoldenratio" :default GridGoldenratio]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grid-goldenratio
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GridGoldenratio)))