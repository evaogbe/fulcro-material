(ns ogbe.fulcro.mui.icons.screen-lock-landscape
  #?(:cljs (:require
            ["@mui/icons-material/ScreenLockLandscape" :default ScreenLockLandscape]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-screen-lock-landscape
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScreenLockLandscape)))