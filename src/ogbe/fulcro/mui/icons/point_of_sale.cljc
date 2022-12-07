(ns ogbe.fulcro.mui.icons.point-of-sale
  #?(:cljs (:require
            ["@mui/icons-material/PointOfSale" :default PointOfSale]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-point-of-sale
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PointOfSale)))