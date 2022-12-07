(ns ogbe.fulcro.mui.icons.check-circle-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CheckCircleSharp" :default CheckCircleSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-check-circle-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CheckCircleSharp)))