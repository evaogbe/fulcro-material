(ns ogbe.fulcro.mui.icons.menu-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MenuOutlined" :default MenuOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-menu-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MenuOutlined)))