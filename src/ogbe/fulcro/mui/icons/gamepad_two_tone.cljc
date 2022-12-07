(ns ogbe.fulcro.mui.icons.gamepad-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/GamepadTwoTone" :default GamepadTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gamepad-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GamepadTwoTone)))