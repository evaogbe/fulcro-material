(ns ogbe.fulcro.mui.icons.dataset-linked
  #?(:cljs (:require
            ["@mui/icons-material/DatasetLinked" :default DatasetLinked]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dataset-linked
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DatasetLinked)))