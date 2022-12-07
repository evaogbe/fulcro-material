(ns ogbe.fulcro.mui.icons.menu-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MenuSharp" :default MenuSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-menu-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MenuSharp)))