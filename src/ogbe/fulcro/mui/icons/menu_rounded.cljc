(ns ogbe.fulcro.mui.icons.menu-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MenuRounded" :default MenuRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-menu-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MenuRounded)))