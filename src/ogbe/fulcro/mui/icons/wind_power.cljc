(ns ogbe.fulcro.mui.icons.wind-power
  #?(:cljs (:require
            ["@mui/icons-material/WindPower" :default WindPower]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wind-power
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WindPower)))