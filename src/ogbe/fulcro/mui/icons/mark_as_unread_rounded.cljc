(ns ogbe.fulcro.mui.icons.mark-as-unread-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MarkAsUnreadRounded" :default MarkAsUnreadRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mark-as-unread-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MarkAsUnreadRounded)))