(ns ogbe.fulcro.mui.icons.settings
  #?(:cljs (:require
            ["@mui/icons-material/Settings" :default Settings]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Settings)))