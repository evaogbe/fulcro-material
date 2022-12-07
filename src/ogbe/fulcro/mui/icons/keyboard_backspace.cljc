(ns ogbe.fulcro.mui.icons.keyboard-backspace
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardBackspace" :default KeyboardBackspace]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-backspace
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardBackspace)))