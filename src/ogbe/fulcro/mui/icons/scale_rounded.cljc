(ns ogbe.fulcro.mui.icons.scale-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ScaleRounded" :default ScaleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-scale-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScaleRounded)))