(ns ogbe.fulcro.mui.icons.keyboard-backspace-sharp
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardBackspaceSharp" :default KeyboardBackspaceSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-backspace-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardBackspaceSharp)))