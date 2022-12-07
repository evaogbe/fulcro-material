(ns ogbe.fulcro.mui.icons.shortcut-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ShortcutTwoTone" :default ShortcutTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shortcut-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShortcutTwoTone)))