(ns ogbe.fulcro.mui.icons.data-array-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DataArrayRounded" :default DataArrayRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-data-array-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DataArrayRounded)))