(ns ogbe.fulcro.mui.icons.train-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TrainSharp" :default TrainSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-train-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TrainSharp)))