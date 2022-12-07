(ns ogbe.fulcro.mui.icons.send-time-extension
  #?(:cljs (:require
            ["@mui/icons-material/SendTimeExtension" :default SendTimeExtension]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-send-time-extension
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SendTimeExtension)))