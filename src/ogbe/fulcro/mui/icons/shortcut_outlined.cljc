(ns ogbe.fulcro.mui.icons.shortcut-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ShortcutOutlined" :default ShortcutOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shortcut-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShortcutOutlined)))