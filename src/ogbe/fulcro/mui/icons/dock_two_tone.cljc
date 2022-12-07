(ns ogbe.fulcro.mui.icons.dock-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/DockTwoTone" :default DockTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dock-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DockTwoTone)))