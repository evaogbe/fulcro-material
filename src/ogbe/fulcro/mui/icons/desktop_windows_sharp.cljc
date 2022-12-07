(ns ogbe.fulcro.mui.icons.desktop-windows-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DesktopWindowsSharp" :default DesktopWindowsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-desktop-windows-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DesktopWindowsSharp)))