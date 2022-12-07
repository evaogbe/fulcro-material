(ns ogbe.fulcro.mui.icons.legend-toggle
  #?(:cljs (:require
            ["@mui/icons-material/LegendToggle" :default LegendToggle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-legend-toggle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LegendToggle)))