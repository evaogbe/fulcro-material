(ns ogbe.fulcro.mui.icons.data-object-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DataObjectSharp" :default DataObjectSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-data-object-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DataObjectSharp)))