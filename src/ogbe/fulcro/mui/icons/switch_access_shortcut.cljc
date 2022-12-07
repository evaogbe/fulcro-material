(ns ogbe.fulcro.mui.icons.switch-access-shortcut
  #?(:cljs (:require
            ["@mui/icons-material/SwitchAccessShortcut" :default SwitchAccessShortcut]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-switch-access-shortcut
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwitchAccessShortcut)))