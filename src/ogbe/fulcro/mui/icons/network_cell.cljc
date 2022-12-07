(ns ogbe.fulcro.mui.icons.network-cell
  #?(:cljs (:require
            ["@mui/icons-material/NetworkCell" :default NetworkCell]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-network-cell
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NetworkCell)))