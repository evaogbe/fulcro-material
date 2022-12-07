(ns ogbe.fulcro.mui.icons.settings-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SettingsSharp" :default SettingsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsSharp)))