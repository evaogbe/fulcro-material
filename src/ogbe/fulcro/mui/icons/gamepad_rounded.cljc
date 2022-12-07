(ns ogbe.fulcro.mui.icons.gamepad-rounded
  #?(:cljs (:require
            ["@mui/icons-material/GamepadRounded" :default GamepadRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gamepad-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GamepadRounded)))