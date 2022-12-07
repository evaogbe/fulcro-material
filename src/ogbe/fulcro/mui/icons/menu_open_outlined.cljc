(ns ogbe.fulcro.mui.icons.menu-open-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MenuOpenOutlined" :default MenuOpenOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-menu-open-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MenuOpenOutlined)))