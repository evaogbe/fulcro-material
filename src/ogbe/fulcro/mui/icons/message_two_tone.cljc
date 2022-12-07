(ns ogbe.fulcro.mui.icons.message-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/MessageTwoTone" :default MessageTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-message-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MessageTwoTone)))