(ns ogbe.fulcro.mui.icons.devices-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DevicesRounded" :default DevicesRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-devices-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DevicesRounded)))