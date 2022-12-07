(ns ogbe.fulcro.mui.icons.supervisor-account
  #?(:cljs (:require
            ["@mui/icons-material/SupervisorAccount" :default SupervisorAccount]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-supervisor-account
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SupervisorAccount)))