(ns ogbe.fulcro.mui.icons.keyboard-option-key
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardOptionKey" :default KeyboardOptionKey]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-option-key
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardOptionKey)))