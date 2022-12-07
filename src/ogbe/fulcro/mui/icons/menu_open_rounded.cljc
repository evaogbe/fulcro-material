(ns ogbe.fulcro.mui.icons.menu-open-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MenuOpenRounded" :default MenuOpenRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-menu-open-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MenuOpenRounded)))