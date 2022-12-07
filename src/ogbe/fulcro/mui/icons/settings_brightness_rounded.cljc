(ns ogbe.fulcro.mui.icons.settings-brightness-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SettingsBrightnessRounded" :default SettingsBrightnessRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-brightness-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsBrightnessRounded)))