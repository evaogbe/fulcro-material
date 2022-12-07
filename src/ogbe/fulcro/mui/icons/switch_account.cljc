(ns ogbe.fulcro.mui.icons.switch-account
  #?(:cljs (:require
            ["@mui/icons-material/SwitchAccount" :default SwitchAccount]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-switch-account
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwitchAccount)))