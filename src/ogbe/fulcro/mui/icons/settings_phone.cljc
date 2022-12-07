(ns ogbe.fulcro.mui.icons.settings-phone
  #?(:cljs (:require
            ["@mui/icons-material/SettingsPhone" :default SettingsPhone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-phone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsPhone)))