(ns ogbe.fulcro.mui.icons.data-object-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DataObjectRounded" :default DataObjectRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-data-object-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DataObjectRounded)))