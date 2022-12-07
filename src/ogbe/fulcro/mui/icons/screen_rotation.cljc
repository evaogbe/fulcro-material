(ns ogbe.fulcro.mui.icons.screen-rotation
  #?(:cljs (:require
            ["@mui/icons-material/ScreenRotation" :default ScreenRotation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-screen-rotation
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScreenRotation)))