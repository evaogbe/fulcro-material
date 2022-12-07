(ns ogbe.fulcro.mui.icons.switch-left-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SwitchLeftRounded" :default SwitchLeftRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-switch-left-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwitchLeftRounded)))