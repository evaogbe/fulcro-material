(ns ogbe.fulcro.mui.icons.cell-wifi
  #?(:cljs (:require
            ["@mui/icons-material/CellWifi" :default CellWifi]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cell-wifi
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CellWifi)))