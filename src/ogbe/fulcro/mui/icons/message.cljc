(ns ogbe.fulcro.mui.icons.message
  #?(:cljs (:require
            ["@mui/icons-material/Message" :default Message]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-message
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Message)))