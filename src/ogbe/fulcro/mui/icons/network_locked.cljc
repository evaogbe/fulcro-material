(ns ogbe.fulcro.mui.icons.network-locked
  #?(:cljs (:require
            ["@mui/icons-material/NetworkLocked" :default NetworkLocked]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-network-locked
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NetworkLocked)))