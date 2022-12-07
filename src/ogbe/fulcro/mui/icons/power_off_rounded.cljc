(ns ogbe.fulcro.mui.icons.power-off-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PowerOffRounded" :default PowerOffRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-power-off-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PowerOffRounded)))