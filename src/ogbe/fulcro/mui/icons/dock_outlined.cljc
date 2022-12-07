(ns ogbe.fulcro.mui.icons.dock-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DockOutlined" :default DockOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dock-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DockOutlined)))