(ns ogbe.fulcro.mui.icons.security-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SecurityOutlined" :default SecurityOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-security-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SecurityOutlined)))