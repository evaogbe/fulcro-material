(ns ogbe.fulcro.mui.icons.mark-as-unread
  #?(:cljs (:require
            ["@mui/icons-material/MarkAsUnread" :default MarkAsUnread]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mark-as-unread
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MarkAsUnread)))