(ns ogbe.fulcro.mui.icons.dataset-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DatasetSharp" :default DatasetSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dataset-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DatasetSharp)))