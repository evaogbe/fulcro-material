(ns ogbe.fulcro.mui.icons.send-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SendOutlined" :default SendOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-send-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SendOutlined)))