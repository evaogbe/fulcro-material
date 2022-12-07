(ns ogbe.fulcro.mui.icons.notifications-none-rounded
  #?(:cljs (:require
            ["@mui/icons-material/NotificationsNoneRounded" :default NotificationsNoneRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notifications-none-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotificationsNoneRounded)))