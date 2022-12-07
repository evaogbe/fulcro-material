(ns ogbe.fulcro.mui.icons.data-thresholding
  #?(:cljs (:require
            ["@mui/icons-material/DataThresholding" :default DataThresholding]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-data-thresholding
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DataThresholding)))