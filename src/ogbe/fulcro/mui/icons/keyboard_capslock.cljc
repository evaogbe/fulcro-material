(ns ogbe.fulcro.mui.icons.keyboard-capslock
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardCapslock" :default KeyboardCapslock]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-capslock
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardCapslock)))