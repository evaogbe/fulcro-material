(ns ogbe.fulcro.mui.icons.dock
  #?(:cljs (:require
            ["@mui/icons-material/Dock" :default Dock]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dock
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Dock)))