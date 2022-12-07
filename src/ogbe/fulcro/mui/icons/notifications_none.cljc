(ns ogbe.fulcro.mui.icons.notifications-none
  #?(:cljs (:require
            ["@mui/icons-material/NotificationsNone" :default NotificationsNone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notifications-none
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotificationsNone)))