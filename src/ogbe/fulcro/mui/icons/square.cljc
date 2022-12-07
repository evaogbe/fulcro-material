(ns ogbe.fulcro.mui.icons.square
  #?(:cljs (:require
            ["@mui/icons-material/Square" :default Square]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-square
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Square)))