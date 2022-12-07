(ns ogbe.fulcro.mui.icons.screen-lock-portrait
  #?(:cljs (:require
            ["@mui/icons-material/ScreenLockPortrait" :default ScreenLockPortrait]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-screen-lock-portrait
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScreenLockPortrait)))