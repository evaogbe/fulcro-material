(ns ogbe.fulcro.mui.icons.screen-search-desktop
  #?(:cljs (:require
            ["@mui/icons-material/ScreenSearchDesktop" :default ScreenSearchDesktop]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-screen-search-desktop
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScreenSearchDesktop)))