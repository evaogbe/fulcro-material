(ns ogbe.fulcro.mui.icons.control-point-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ControlPointOutlined" :default ControlPointOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-control-point-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ControlPointOutlined)))