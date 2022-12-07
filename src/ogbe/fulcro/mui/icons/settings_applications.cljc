(ns ogbe.fulcro.mui.icons.settings-applications
  #?(:cljs (:require
            ["@mui/icons-material/SettingsApplications" :default SettingsApplications]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-applications
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsApplications)))