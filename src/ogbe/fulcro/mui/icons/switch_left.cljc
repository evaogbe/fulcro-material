(ns ogbe.fulcro.mui.icons.switch-left
  #?(:cljs (:require
            ["@mui/icons-material/SwitchLeft" :default SwitchLeft]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-switch-left
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwitchLeft)))