(ns ogbe.fulcro.mui.icons.switch-account-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SwitchAccountRounded" :default SwitchAccountRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-switch-account-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwitchAccountRounded)))