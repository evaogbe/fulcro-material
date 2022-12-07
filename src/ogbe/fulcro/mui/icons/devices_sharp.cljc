(ns ogbe.fulcro.mui.icons.devices-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DevicesSharp" :default DevicesSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-devices-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DevicesSharp)))