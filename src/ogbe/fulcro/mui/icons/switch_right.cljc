(ns ogbe.fulcro.mui.icons.switch-right
  #?(:cljs (:require
            ["@mui/icons-material/SwitchRight" :default SwitchRight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-switch-right
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwitchRight)))