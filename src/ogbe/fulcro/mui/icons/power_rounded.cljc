(ns ogbe.fulcro.mui.icons.power-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PowerRounded" :default PowerRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-power-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PowerRounded)))