(ns ogbe.fulcro.mui.icons.shortcut-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ShortcutRounded" :default ShortcutRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shortcut-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShortcutRounded)))