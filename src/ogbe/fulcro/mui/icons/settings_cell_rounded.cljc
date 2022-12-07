(ns ogbe.fulcro.mui.icons.settings-cell-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SettingsCellRounded" :default SettingsCellRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-cell-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsCellRounded)))