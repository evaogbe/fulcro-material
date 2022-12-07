(ns ogbe.fulcro.mui.icons.dataset-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DatasetOutlined" :default DatasetOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dataset-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DatasetOutlined)))