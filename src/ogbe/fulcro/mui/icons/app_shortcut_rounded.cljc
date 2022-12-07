(ns ogbe.fulcro.mui.icons.app-shortcut-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AppShortcutRounded" :default AppShortcutRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-app-shortcut-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AppShortcutRounded)))