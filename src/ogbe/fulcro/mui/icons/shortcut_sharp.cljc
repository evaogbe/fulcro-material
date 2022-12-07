(ns ogbe.fulcro.mui.icons.shortcut-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ShortcutSharp" :default ShortcutSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shortcut-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShortcutSharp)))