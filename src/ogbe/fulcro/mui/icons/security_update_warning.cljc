(ns ogbe.fulcro.mui.icons.security-update-warning
  #?(:cljs (:require
            ["@mui/icons-material/SecurityUpdateWarning" :default SecurityUpdateWarning]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-security-update-warning
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SecurityUpdateWarning)))