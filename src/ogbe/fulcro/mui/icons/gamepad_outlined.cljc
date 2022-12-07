(ns ogbe.fulcro.mui.icons.gamepad-outlined
  #?(:cljs (:require
            ["@mui/icons-material/GamepadOutlined" :default GamepadOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gamepad-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GamepadOutlined)))