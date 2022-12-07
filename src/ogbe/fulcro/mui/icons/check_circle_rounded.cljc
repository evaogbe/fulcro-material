(ns ogbe.fulcro.mui.icons.check-circle-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CheckCircleRounded" :default CheckCircleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-check-circle-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CheckCircleRounded)))