(ns ogbe.fulcro.mui.icons.grid-off
  #?(:cljs (:require
            ["@mui/icons-material/GridOff" :default GridOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grid-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GridOff)))