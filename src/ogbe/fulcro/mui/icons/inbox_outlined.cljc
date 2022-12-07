(ns ogbe.fulcro.mui.icons.inbox-outlined
  #?(:cljs (:require
            ["@mui/icons-material/InboxOutlined" :default InboxOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-inbox-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InboxOutlined)))