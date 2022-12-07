(ns ogbe.fulcro.mui.icons.brightness-high
  #?(:cljs (:require
            ["@mui/icons-material/BrightnessHigh" :default BrightnessHigh]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-brightness-high
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BrightnessHigh)))