(ns ogbe.fulcro.mui.icons.menu-open
  #?(:cljs (:require
            ["@mui/icons-material/MenuOpen" :default MenuOpen]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-menu-open
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MenuOpen)))