(ns ogbe.fulcro.mui.icons.broadcast-on-personal
  #?(:cljs (:require
            ["@mui/icons-material/BroadcastOnPersonal" :default BroadcastOnPersonal]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-broadcast-on-personal
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BroadcastOnPersonal)))