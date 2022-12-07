(ns ogbe.fulcro.mui.icons.shortcut
  #?(:cljs (:require
            ["@mui/icons-material/Shortcut" :default Shortcut]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shortcut
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Shortcut)))