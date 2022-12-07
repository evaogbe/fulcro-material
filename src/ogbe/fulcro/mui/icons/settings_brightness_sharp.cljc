(ns ogbe.fulcro.mui.icons.settings-brightness-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SettingsBrightnessSharp" :default SettingsBrightnessSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-brightness-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsBrightnessSharp)))