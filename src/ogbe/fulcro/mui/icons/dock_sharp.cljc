(ns ogbe.fulcro.mui.icons.dock-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DockSharp" :default DockSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dock-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DockSharp)))