(ns ogbe.fulcro.mui.icons.notifications-paused
  #?(:cljs (:require
            ["@mui/icons-material/NotificationsPaused" :default NotificationsPaused]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notifications-paused
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotificationsPaused)))