(ns ogbe.fulcro.mui.icons.sim-card-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SimCardRounded" :default SimCardRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sim-card-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SimCardRounded)))