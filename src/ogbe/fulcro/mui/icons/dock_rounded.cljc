(ns ogbe.fulcro.mui.icons.dock-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DockRounded" :default DockRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dock-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DockRounded)))