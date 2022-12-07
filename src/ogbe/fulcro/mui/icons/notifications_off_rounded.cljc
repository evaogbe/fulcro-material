(ns ogbe.fulcro.mui.icons.notifications-off-rounded
  #?(:cljs (:require
            ["@mui/icons-material/NotificationsOffRounded" :default NotificationsOffRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notifications-off-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotificationsOffRounded)))