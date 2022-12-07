(ns ogbe.fulcro.mui.icons.app-shortcut
  #?(:cljs (:require
            ["@mui/icons-material/AppShortcut" :default AppShortcut]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-app-shortcut
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AppShortcut)))