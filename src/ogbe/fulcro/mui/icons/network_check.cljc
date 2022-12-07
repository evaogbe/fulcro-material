(ns ogbe.fulcro.mui.icons.network-check
  #?(:cljs (:require
            ["@mui/icons-material/NetworkCheck" :default NetworkCheck]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-network-check
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NetworkCheck)))