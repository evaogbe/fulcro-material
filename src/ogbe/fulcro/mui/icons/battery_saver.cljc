(ns ogbe.fulcro.mui.icons.battery-saver
  #?(:cljs (:require
            ["@mui/icons-material/BatterySaver" :default BatterySaver]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-saver
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatterySaver)))