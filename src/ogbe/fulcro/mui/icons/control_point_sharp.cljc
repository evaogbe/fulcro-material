(ns ogbe.fulcro.mui.icons.control-point-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ControlPointSharp" :default ControlPointSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-control-point-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ControlPointSharp)))