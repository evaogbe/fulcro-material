(ns ogbe.fulcro.mui.icons.install-desktop
  #?(:cljs (:require
            ["@mui/icons-material/InstallDesktop" :default InstallDesktop]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-install-desktop
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InstallDesktop)))