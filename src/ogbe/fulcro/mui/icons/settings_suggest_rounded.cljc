(ns ogbe.fulcro.mui.icons.settings-suggest-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SettingsSuggestRounded" :default SettingsSuggestRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-suggest-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsSuggestRounded)))