(ns ogbe.fulcro.mui.icons.rotate-right
  #?(:cljs (:require
            ["@mui/icons-material/RotateRight" :default RotateRight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rotate-right
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RotateRight)))