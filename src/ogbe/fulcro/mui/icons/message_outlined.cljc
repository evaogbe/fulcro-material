(ns ogbe.fulcro.mui.icons.message-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MessageOutlined" :default MessageOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-message-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MessageOutlined)))