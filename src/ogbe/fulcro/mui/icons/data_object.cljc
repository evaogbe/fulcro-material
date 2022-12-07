(ns ogbe.fulcro.mui.icons.data-object
  #?(:cljs (:require
            ["@mui/icons-material/DataObject" :default DataObject]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-data-object
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DataObject)))