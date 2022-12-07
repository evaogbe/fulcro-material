(ns ogbe.fulcro.mui.icons.model-training
  #?(:cljs (:require
            ["@mui/icons-material/ModelTraining" :default ModelTraining]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-model-training
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ModelTraining)))