(ns ogbe.fulcro.mui.icons.desktop-windows
  #?(:cljs (:require
            ["@mui/icons-material/DesktopWindows" :default DesktopWindows]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-desktop-windows
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DesktopWindows)))