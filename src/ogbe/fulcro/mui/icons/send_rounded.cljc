(ns ogbe.fulcro.mui.icons.send-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SendRounded" :default SendRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-send-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SendRounded)))