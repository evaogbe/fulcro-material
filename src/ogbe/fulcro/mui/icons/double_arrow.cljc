(ns ogbe.fulcro.mui.icons.double-arrow
  #?(:cljs (:require
            ["@mui/icons-material/DoubleArrow" :default DoubleArrow]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-double-arrow
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoubleArrow)))