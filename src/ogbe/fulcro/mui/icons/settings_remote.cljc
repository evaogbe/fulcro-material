(ns ogbe.fulcro.mui.icons.settings-remote
  #?(:cljs (:require
            ["@mui/icons-material/SettingsRemote" :default SettingsRemote]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-remote
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsRemote)))