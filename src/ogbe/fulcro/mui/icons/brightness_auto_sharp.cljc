(ns ogbe.fulcro.mui.icons.brightness-auto-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BrightnessAutoSharp" :default BrightnessAutoSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-brightness-auto-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BrightnessAutoSharp)))