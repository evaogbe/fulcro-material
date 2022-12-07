(ns ogbe.fulcro.mui.icons.menu-book
  #?(:cljs (:require
            ["@mui/icons-material/MenuBook" :default MenuBook]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-menu-book
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MenuBook)))