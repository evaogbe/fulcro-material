(ns ogbe.fulcro.mui.icons.settings-brightness-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SettingsBrightnessTwoTone" :default SettingsBrightnessTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-brightness-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsBrightnessTwoTone)))