(ns ogbe.fulcro.mui.icons.control-point-duplicate
  #?(:cljs (:require
            ["@mui/icons-material/ControlPointDuplicate" :default ControlPointDuplicate]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-control-point-duplicate
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ControlPointDuplicate)))