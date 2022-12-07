(ns ogbe.fulcro.mui.icons.broadcast-on-home
  #?(:cljs (:require
            ["@mui/icons-material/BroadcastOnHome" :default BroadcastOnHome]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-broadcast-on-home
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BroadcastOnHome)))