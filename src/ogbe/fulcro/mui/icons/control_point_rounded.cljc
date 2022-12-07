(ns ogbe.fulcro.mui.icons.control-point-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ControlPointRounded" :default ControlPointRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-control-point-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ControlPointRounded)))