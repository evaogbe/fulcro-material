(ns ogbe.fulcro.mui.icons.devices-other
  #?(:cljs (:require
            ["@mui/icons-material/DevicesOther" :default DevicesOther]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-devices-other
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DevicesOther)))