(ns ogbe.fulcro.mui.icons.double-arrow-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DoubleArrowRounded" :default DoubleArrowRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-double-arrow-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoubleArrowRounded)))