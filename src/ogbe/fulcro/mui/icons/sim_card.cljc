(ns ogbe.fulcro.mui.icons.sim-card
  #?(:cljs (:require
            ["@mui/icons-material/SimCard" :default SimCard]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sim-card
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SimCard)))