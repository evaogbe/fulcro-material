(ns ogbe.fulcro.mui.icons.settings-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SettingsRounded" :default SettingsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsRounded)))