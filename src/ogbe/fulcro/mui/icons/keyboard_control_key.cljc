(ns ogbe.fulcro.mui.icons.keyboard-control-key
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardControlKey" :default KeyboardControlKey]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-control-key
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardControlKey)))