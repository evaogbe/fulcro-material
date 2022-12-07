(ns ogbe.fulcro.mui.icons.screen-rotation-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ScreenRotationRounded" :default ScreenRotationRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-screen-rotation-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScreenRotationRounded)))