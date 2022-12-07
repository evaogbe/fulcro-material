(ns ogbe.fulcro.mui.icons.keyboard-backspace-rounded
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardBackspaceRounded" :default KeyboardBackspaceRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-backspace-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardBackspaceRounded)))