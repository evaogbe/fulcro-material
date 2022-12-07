(ns ogbe.fulcro.mui.icons.send-to-mobile
  #?(:cljs (:require
            ["@mui/icons-material/SendToMobile" :default SendToMobile]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-send-to-mobile
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SendToMobile)))