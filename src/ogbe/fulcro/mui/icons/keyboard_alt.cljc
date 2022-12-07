(ns ogbe.fulcro.mui.icons.keyboard-alt
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardAlt" :default KeyboardAlt]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-alt
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardAlt)))