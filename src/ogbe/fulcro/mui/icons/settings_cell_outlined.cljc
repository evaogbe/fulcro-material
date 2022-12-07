(ns ogbe.fulcro.mui.icons.settings-cell-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SettingsCellOutlined" :default SettingsCellOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-cell-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsCellOutlined)))