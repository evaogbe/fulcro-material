(ns ogbe.fulcro.mui.icons.network-locked-rounded
  #?(:cljs (:require
            ["@mui/icons-material/NetworkLockedRounded" :default NetworkLockedRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-network-locked-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NetworkLockedRounded)))