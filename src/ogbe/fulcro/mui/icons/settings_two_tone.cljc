(ns ogbe.fulcro.mui.icons.settings-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SettingsTwoTone" :default SettingsTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsTwoTone)))