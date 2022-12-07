(ns ogbe.fulcro.mui.icons.brightness-low
  #?(:cljs (:require
            ["@mui/icons-material/BrightnessLow" :default BrightnessLow]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-brightness-low
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BrightnessLow)))