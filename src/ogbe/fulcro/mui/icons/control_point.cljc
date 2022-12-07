(ns ogbe.fulcro.mui.icons.control-point
  #?(:cljs (:require
            ["@mui/icons-material/ControlPoint" :default ControlPoint]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-control-point
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ControlPoint)))