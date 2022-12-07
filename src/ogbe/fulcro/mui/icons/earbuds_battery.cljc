(ns ogbe.fulcro.mui.icons.earbuds-battery
  #?(:cljs (:require
            ["@mui/icons-material/EarbudsBattery" :default EarbudsBattery]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-earbuds-battery
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EarbudsBattery)))