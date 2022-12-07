(ns ogbe.fulcro.mui.icons.brightness-auto
  #?(:cljs (:require
            ["@mui/icons-material/BrightnessAuto" :default BrightnessAuto]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-brightness-auto
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BrightnessAuto)))