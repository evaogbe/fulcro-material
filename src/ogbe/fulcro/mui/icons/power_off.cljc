(ns ogbe.fulcro.mui.icons.power-off
  #?(:cljs (:require
            ["@mui/icons-material/PowerOff" :default PowerOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-power-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PowerOff)))