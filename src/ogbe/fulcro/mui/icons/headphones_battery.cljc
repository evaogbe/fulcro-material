(ns ogbe.fulcro.mui.icons.headphones-battery
  #?(:cljs (:require
            ["@mui/icons-material/HeadphonesBattery" :default HeadphonesBattery]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-headphones-battery
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HeadphonesBattery)))