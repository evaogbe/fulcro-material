(ns ogbe.fulcro.mui.icons.electrical-services
  #?(:cljs (:require
            ["@mui/icons-material/ElectricalServices" :default ElectricalServices]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-electrical-services
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ElectricalServices)))