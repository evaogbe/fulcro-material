(ns ogbe.fulcro.mui.icons.settings-suggest
  #?(:cljs (:require
            ["@mui/icons-material/SettingsSuggest" :default SettingsSuggest]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-suggest
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsSuggest)))