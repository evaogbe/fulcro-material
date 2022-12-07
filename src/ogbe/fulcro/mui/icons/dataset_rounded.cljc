(ns ogbe.fulcro.mui.icons.dataset-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DatasetRounded" :default DatasetRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dataset-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DatasetRounded)))