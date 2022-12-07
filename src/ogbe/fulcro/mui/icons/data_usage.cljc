(ns ogbe.fulcro.mui.icons.data-usage
  #?(:cljs (:require
            ["@mui/icons-material/DataUsage" :default DataUsage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-data-usage
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DataUsage)))