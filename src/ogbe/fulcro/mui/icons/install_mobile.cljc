(ns ogbe.fulcro.mui.icons.install-mobile
  #?(:cljs (:require
            ["@mui/icons-material/InstallMobile" :default InstallMobile]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-install-mobile
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InstallMobile)))