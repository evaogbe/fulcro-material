(ns ogbe.fulcro.mui.icons.important-devices
  #?(:cljs (:require
            ["@mui/icons-material/ImportantDevices" :default ImportantDevices]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-important-devices
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ImportantDevices)))