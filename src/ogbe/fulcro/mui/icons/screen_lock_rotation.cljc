(ns ogbe.fulcro.mui.icons.screen-lock-rotation
  #?(:cljs (:require
            ["@mui/icons-material/ScreenLockRotation" :default ScreenLockRotation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-screen-lock-rotation
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScreenLockRotation)))