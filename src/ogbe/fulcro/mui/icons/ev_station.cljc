(ns ogbe.fulcro.mui.icons.ev-station
  #?(:cljs (:require
            ["@mui/icons-material/EvStation" :default EvStation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-ev-station
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EvStation)))