(ns ogbe.fulcro.mui.icons.rotate-left-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RotateLeftRounded" :default RotateLeftRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rotate-left-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RotateLeftRounded)))