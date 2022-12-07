(ns ogbe.fulcro.mui.icons.sim-card-alert
  #?(:cljs (:require
            ["@mui/icons-material/SimCardAlert" :default SimCardAlert]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sim-card-alert
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SimCardAlert)))