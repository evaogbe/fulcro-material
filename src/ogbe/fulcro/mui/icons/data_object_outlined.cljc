(ns ogbe.fulcro.mui.icons.data-object-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DataObjectOutlined" :default DataObjectOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-data-object-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DataObjectOutlined)))