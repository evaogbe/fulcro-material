(ns ogbe.fulcro.mui.icons.settings-brightness
  #?(:cljs (:require
            ["@mui/icons-material/SettingsBrightness" :default SettingsBrightness]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-brightness
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsBrightness)))