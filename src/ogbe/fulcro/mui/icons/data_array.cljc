(ns ogbe.fulcro.mui.icons.data-array
  #?(:cljs (:require
            ["@mui/icons-material/DataArray" :default DataArray]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-data-array
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DataArray)))