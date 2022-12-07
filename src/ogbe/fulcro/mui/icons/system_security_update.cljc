(ns ogbe.fulcro.mui.icons.system-security-update
  #?(:cljs (:require
            ["@mui/icons-material/SystemSecurityUpdate" :default SystemSecurityUpdate]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-system-security-update
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SystemSecurityUpdate)))