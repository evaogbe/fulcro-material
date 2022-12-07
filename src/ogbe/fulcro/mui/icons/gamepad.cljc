(ns ogbe.fulcro.mui.icons.gamepad
  #?(:cljs (:require
            ["@mui/icons-material/Gamepad" :default Gamepad]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gamepad
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Gamepad)))