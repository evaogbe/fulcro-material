(ns ogbe.fulcro.mui.icons.notification-important
  #?(:cljs (:require
            ["@mui/icons-material/NotificationImportant" :default NotificationImportant]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notification-important
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotificationImportant)))