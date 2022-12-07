(ns ogbe.fulcro.mui.icons.security-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SecurityRounded" :default SecurityRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-security-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SecurityRounded)))