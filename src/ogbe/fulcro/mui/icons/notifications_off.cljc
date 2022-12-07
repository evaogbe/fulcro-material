(ns ogbe.fulcro.mui.icons.notifications-off
  #?(:cljs (:require
            ["@mui/icons-material/NotificationsOff" :default NotificationsOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notifications-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotificationsOff)))