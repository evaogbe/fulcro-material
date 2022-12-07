(ns ogbe.fulcro.mui.icons.security-update
  #?(:cljs (:require
            ["@mui/icons-material/SecurityUpdate" :default SecurityUpdate]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-security-update
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SecurityUpdate)))