(ns ogbe.fulcro.mui.icons.app-shortcut-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AppShortcutSharp" :default AppShortcutSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-app-shortcut-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AppShortcutSharp)))