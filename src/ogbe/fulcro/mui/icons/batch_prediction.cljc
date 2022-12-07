(ns ogbe.fulcro.mui.icons.batch-prediction
  #?(:cljs (:require
            ["@mui/icons-material/BatchPrediction" :default BatchPrediction]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-batch-prediction
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatchPrediction)))