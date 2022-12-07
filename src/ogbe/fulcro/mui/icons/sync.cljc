(ns ogbe.fulcro.mui.icons.sync
  #?(:cljs (:require
            ["@mui/icons-material/Sync" :default Sync]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sync
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Sync)))