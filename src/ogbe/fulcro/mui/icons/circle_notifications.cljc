(ns ogbe.fulcro.mui.icons.circle-notifications
  #?(:cljs (:require
            ["@mui/icons-material/CircleNotifications" :default CircleNotifications]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-circle-notifications
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CircleNotifications)))