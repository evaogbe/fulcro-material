(ns ogbe.fulcro.mui.icons.rotate-left
  #?(:cljs (:require
            ["@mui/icons-material/RotateLeft" :default RotateLeft]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rotate-left
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RotateLeft)))