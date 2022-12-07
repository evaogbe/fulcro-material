(ns ogbe.fulcro.mui.icons.menu-open-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MenuOpenSharp" :default MenuOpenSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-menu-open-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MenuOpenSharp)))