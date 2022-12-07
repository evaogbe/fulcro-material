(ns ogbe.fulcro.mui.icons.cable-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CableRounded" :default CableRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cable-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CableRounded)))