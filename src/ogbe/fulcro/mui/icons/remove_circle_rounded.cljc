(ns ogbe.fulcro.mui.icons.remove-circle-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RemoveCircleRounded" :default RemoveCircleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-remove-circle-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RemoveCircleRounded)))