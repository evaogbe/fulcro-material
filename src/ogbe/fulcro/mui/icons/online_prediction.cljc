(ns ogbe.fulcro.mui.icons.online-prediction
  #?(:cljs (:require
            ["@mui/icons-material/OnlinePrediction" :default OnlinePrediction]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-online-prediction
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OnlinePrediction)))