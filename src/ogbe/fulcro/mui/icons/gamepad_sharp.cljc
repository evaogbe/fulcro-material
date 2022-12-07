(ns ogbe.fulcro.mui.icons.gamepad-sharp
  #?(:cljs (:require
            ["@mui/icons-material/GamepadSharp" :default GamepadSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gamepad-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GamepadSharp)))