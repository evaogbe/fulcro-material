(ns ogbe.fulcro.mui.icons.message-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MessageRounded" :default MessageRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-message-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MessageRounded)))