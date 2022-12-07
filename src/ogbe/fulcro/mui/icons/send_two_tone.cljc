(ns ogbe.fulcro.mui.icons.send-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SendTwoTone" :default SendTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-send-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SendTwoTone)))