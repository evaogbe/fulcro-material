(ns ogbe.fulcro.mui.icons.not-interested
  #?(:cljs (:require
            ["@mui/icons-material/NotInterested" :default NotInterested]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-not-interested
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotInterested)))