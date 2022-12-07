(ns ogbe.fulcro.mui.icons.three-p
  #?(:cljs (:require
            ["@mui/icons-material/ThreeP" :default ThreeP]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-three-p
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThreeP)))