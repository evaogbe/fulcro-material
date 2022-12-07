(ns ogbe.fulcro.mui.icons.local-gas-station
  #?(:cljs (:require
            ["@mui/icons-material/LocalGasStation" :default LocalGasStation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-gas-station
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalGasStation)))