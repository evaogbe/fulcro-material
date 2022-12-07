(ns ogbe.fulcro.mui.icons.notification-add-sharp
  #?(:cljs (:require
            ["@mui/icons-material/NotificationAddSharp" :default NotificationAddSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notification-add-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotificationAddSharp)))