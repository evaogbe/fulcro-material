(ns ogbe.fulcro.mui.icons.notification-add
  #?(:cljs (:require
            ["@mui/icons-material/NotificationAdd" :default NotificationAdd]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notification-add
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotificationAdd)))