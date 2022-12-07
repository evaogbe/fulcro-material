(ns ogbe.fulcro.mui.icons.settings-overscan
  #?(:cljs (:require
            ["@mui/icons-material/SettingsOverscan" :default SettingsOverscan]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-overscan
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsOverscan)))