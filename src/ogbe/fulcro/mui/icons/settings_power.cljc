(ns ogbe.fulcro.mui.icons.settings-power
  #?(:cljs (:require
            ["@mui/icons-material/SettingsPower" :default SettingsPower]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-power
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsPower)))