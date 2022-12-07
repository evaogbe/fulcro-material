(ns ogbe.fulcro.mui.icons.desktop-mac
  #?(:cljs (:require
            ["@mui/icons-material/DesktopMac" :default DesktopMac]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-desktop-mac
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DesktopMac)))