(ns ogbe.fulcro.mui.icons.bolt-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BoltRounded" :default BoltRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bolt-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BoltRounded)))