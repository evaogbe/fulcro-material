(ns ogbe.fulcro.mui.icons.devices-fold
  #?(:cljs (:require
            ["@mui/icons-material/DevicesFold" :default DevicesFold]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-devices-fold
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DevicesFold)))