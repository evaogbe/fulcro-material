(ns ogbe.fulcro.mui.icons.menu-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/MenuTwoTone" :default MenuTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-menu-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MenuTwoTone)))