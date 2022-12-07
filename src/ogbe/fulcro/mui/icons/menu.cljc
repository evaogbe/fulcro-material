(ns ogbe.fulcro.mui.icons.menu
  #?(:cljs (:require
            ["@mui/icons-material/Menu" :default Menu]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-menu
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Menu)))