(ns ogbe.fulcro.mui.icons.check-circle
  #?(:cljs (:require
            ["@mui/icons-material/CheckCircle" :default CheckCircle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-check-circle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CheckCircle)))