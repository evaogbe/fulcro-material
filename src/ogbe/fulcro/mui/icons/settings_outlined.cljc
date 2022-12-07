(ns ogbe.fulcro.mui.icons.settings-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SettingsOutlined" :default SettingsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsOutlined)))