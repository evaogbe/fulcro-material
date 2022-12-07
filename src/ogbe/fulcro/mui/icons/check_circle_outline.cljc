(ns ogbe.fulcro.mui.icons.check-circle-outline
  #?(:cljs (:require
            ["@mui/icons-material/CheckCircleOutline" :default CheckCircleOutline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-check-circle-outline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CheckCircleOutline)))