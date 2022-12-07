(ns ogbe.fulcro.mui.icons.notifications-rounded
  #?(:cljs (:require
            ["@mui/icons-material/NotificationsRounded" :default NotificationsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notifications-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotificationsRounded)))