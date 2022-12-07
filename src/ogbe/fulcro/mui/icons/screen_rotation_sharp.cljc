(ns ogbe.fulcro.mui.icons.screen-rotation-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ScreenRotationSharp" :default ScreenRotationSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-screen-rotation-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScreenRotationSharp)))