(ns ogbe.fulcro.mui.icons.settings-cell-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SettingsCellSharp" :default SettingsCellSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-cell-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsCellSharp)))