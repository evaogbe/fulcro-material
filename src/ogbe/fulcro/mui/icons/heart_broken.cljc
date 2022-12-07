(ns ogbe.fulcro.mui.icons.heart-broken
  #?(:cljs (:require
            ["@mui/icons-material/HeartBroken" :default HeartBroken]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-heart-broken
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HeartBroken)))