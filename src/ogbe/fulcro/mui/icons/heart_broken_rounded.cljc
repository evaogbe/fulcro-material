(ns ogbe.fulcro.mui.icons.heart-broken-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HeartBrokenRounded" :default HeartBrokenRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-heart-broken-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HeartBrokenRounded)))