(ns ogbe.fulcro.mui.icons.shield-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ShieldRounded" :default ShieldRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shield-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShieldRounded)))